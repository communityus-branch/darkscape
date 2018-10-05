package rs.darkscape.app.server.message;

import io.netty.buffer.ByteBuf;

public enum IntegerFieldType implements FieldType<Integer> {
  ;

  private final FieldTypeDecoder<Integer> decoder;
  private final FieldTypeEncoder<Integer> encoder;

  IntegerFieldType(FieldTypeDecoder<Integer> decoder,
                   FieldTypeEncoder<Integer> encoder) {
    this.decoder = decoder;
    this.encoder = encoder;
  }


  @Override
  public Integer decode(ByteBuf buffer) {
    return null;
  }

  @Override
  public void encode(ByteBuf buffer, Integer value) {

  }
}
