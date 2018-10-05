package rs.darkscape.app.server;

import java.util.HashMap;
import java.util.Map;

public final class ServerConfiguration {

  private final Map<String, String> values = new HashMap<>();

  private ServerConfiguration() {}

  public static ServerConfiguration defaultConfig() {
    return new ServerConfiguration();
  }

  public String get(String name) {
    return values.get(name);
  }
}
