package rs.darkscape.app.server.packet;

public class UnsupportedPacketException extends RuntimeException {

  public UnsupportedPacketException() {

  }

  public UnsupportedPacketException(String message) {
    super(message);
  }
}
