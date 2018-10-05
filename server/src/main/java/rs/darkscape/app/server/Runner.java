package rs.darkscape.app.server;

public class Runner {

  public static void main(String... args) {
    ServerComponent server = DaggerServerComponent.builder()
        .configuration(ServerConfiguration.defaultConfig())
        .build();

    server.bootstrap().bind(5555);
  }
}
