package rs.darkscape.app.server.packet;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import rs.darkscape.proto.Mappings;
import rs.darkscape.proto.Mappings.PacketFieldOptions;
import rs.darkscape.proto.Mappings.PacketOptions;
import rs.darkscape.proto.Mappings.Source;
import rs.darkscape.proto.Mappings.Type;

public final class Packet {

  public static final int VARIABLE_LENGTH_BYTE = -1;
  public static final int VARIABLE_LENGTH_SHORT = -2;

  private final Descriptor descriptor;
  private final ByteBuf buffer;

  public Packet(Descriptor descriptor, ByteBuf buffer) {
    this.descriptor = descriptor;
    this.buffer = buffer;
  }

  public static Descriptor descriptorFor(Message message) {
    Descriptors.Descriptor desc = message.getDescriptorForType();
    if (!desc.getOptions().hasExtension(Mappings.packet)) {
      throw new IllegalArgumentException("Message is not mappable to a packet.");
    }

    PacketOptions options = message.getDescriptorForType()
                                   .getOptions()
                                   .getExtension(Mappings.packet);

    return new Descriptor(message,
                          options.getSource(),
                          options.getId(),
                          getLength(message.getDescriptorForType()));
  }

  public static int getLength(Descriptors.Descriptor descriptor) {
    if (!descriptor.getOptions().hasExtension(Mappings.packet)) {
      throw new IllegalArgumentException("Message is not mappable to a packet.");
    }

    PacketOptions options = descriptor.getOptions().getExtension(Mappings.packet);
    switch (options.getLength()) {
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

  private static int getStaticLength(Descriptors.Descriptor descriptor) {
    return bitsToBytes(getStaticBitLength(descriptor));
  }

  private static int getStaticBitLength(Descriptors.Descriptor descriptor) {
    int length = 0;
    for (FieldDescriptor field : descriptor.getFields()) {
      switch (field.getType()) {
        case MESSAGE:
          length += getStaticBitLength(field.getMessageType());
          break;

        default:
          PacketFieldOptions options = field.getOptions().getExtension(Mappings.field);
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

  public static int getLength(Type type) {
    return bitsToBytes(getBitLength(type));
  }

  public static int getBitLength(Type type) {
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
    private final Source source;
    private final int id;
    private final int length;

    private Descriptor(Message message, Source source, int id, int length) {
      this.message = message;
      this.source = source;
      this.id = id;
      this.length = length;
    }

    public Message getMessage() {
      return message;
    }

    public Source getSource() {
      return source;
    }

    public int getId() {
      return id;
    }

    public int getLength() {
      return length;
    }
  }
}
