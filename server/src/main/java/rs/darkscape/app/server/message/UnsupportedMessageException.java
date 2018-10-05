package rs.darkscape.app.server.message;

public class UnsupportedMessageException extends RuntimeException {

  public UnsupportedMessageException() { }

  public UnsupportedMessageException(String message) {
    super(message);
  }
}
