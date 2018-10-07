package rs.darkscape.app.server.packet;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import rs.darkscape.proto.Packet.FieldType;
import rs.darkscape.proto.Packet.Type;
import rs.darkscape.proto.PacketOptions;
import rs.darkscape.proto.PacketOptions.FieldOptions;
import rs.darkscape.proto.PacketOptions.MessageOptions;

public final class Packet {

  public static final int VARIABLE_LENGTH_BYTE = -1;
  public static final int VARIABLE_LENGTH_SHORT = -2;

  private final Descriptor descriptor;
  private final ByteBuf buffer;

  public Packet(Descriptor descriptor, ByteBuf buffer) {
    this.descriptor = descriptor;
    this.buffer = buffer;
  }

  public static MessageOptions getMapping(Descriptors.Descriptor descriptor) {
    return descriptor.getOptions().getExtension(PacketOptions.mapping);
  }

  public static int getLength(Descriptors.Descriptor descriptor) {
    MessageOptions mapping = getMapping(descriptor);
    if (mapping == null) {
      throw new IllegalArgumentException();
    }
    switch (mapping.getLength()) {
      case STATIC:
        return getStaticBitLength(descriptor);
      case BYTE:
        return VARIABLE_LENGTH_BYTE;
      case SHORT:
        return VARIABLE_LENGTH_SHORT;
      default:
        throw new UnsupportedOperationException();
    }
  }

  public static int getStaticLength(Descriptors.Descriptor descriptor) {
    return bitsToBytes(getStaticBitLength(descriptor));
  }

  public static int getStaticBitLength(Descriptors.Descriptor descriptor) {
    int length = 0;
    for (FieldDescriptor field : descriptor.getFields()) {
      switch (field.getType()) {
        case MESSAGE:
          length += getStaticBitLength(field.getMessageType());
          break;

        default:
          FieldOptions options = field.getOptions().getExtension(PacketOptions.field);
          if (options == null) {
            throw new IllegalStateException();
          }

          int fieldLength = getBitLength(options.getType());
          if (fieldLength == -1) {
            throw new IllegalStateException(
                "Cannot determine bit length of field which has a variable length.");
          }
          length += fieldLength;
          break;
      }
    }

    return bitsToBytes(length);
  }

  public static int getLength(FieldType type) {
    return bitsToBytes(getBitLength(type));
  }

  public static int getBitLength(FieldType type) {
    switch (type) {
      case INT8:
        return 8;
      case INT16:
        return 16;
      case INT32:
        return 32;
      case INT64:
        return 64;
      case STRING:
        return -1;
      default:
        throw new UnsupportedOperationException();
    }
  }

  /**
   * Converts the number of bits to bytes. This will round up the number of bits to the nearest byte
   * needed to describe the number of bits.
   *
   * @param length the bit length.
   * @return the byte length.
   */
  private static int bitsToBytes(int length) {
    return (length - 1 >> 3) + 1;
  }

  public Descriptor getDescriptor() {
    return descriptor;
  }

  public ByteBuf getBuffer() {
    return buffer;
  }

  public Message getMessage() {
    return descriptor.getMessage();
  }

  public Descriptors.Descriptor getMessageDescriptor() {
    return descriptor.getMessage().getDescriptorForType();
  }

  public static final class Descriptor {

    private final Message message;
    private final Type type;
    private final int id;
    private final int length;

    public Descriptor(Message message) {
      Descriptors.Descriptor descriptor = message.getDescriptorForType();
      MessageOptions options = descriptor.getOptions().getExtension(PacketOptions.mapping);
      if (options == null) {
        throw new IllegalArgumentException("Message is not mappable to a packet.");
      }
      this.message = message;
      this.type = options.getType();
      this.id = options.getId();
      this.length = Packet.getLength(descriptor);
    }

    public Message getMessage() {
      return message;
    }

    public Type getType() {
      return type;
    }

    public int getId() {
      return id;
    }

    public int getLength() {
      return length;
    }
  }
}
