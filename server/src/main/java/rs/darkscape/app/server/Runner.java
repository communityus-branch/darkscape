package rs.darkscape.app.server;

import com.google.common.collect.ImmutableList;
import com.google.protobuf.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.darkscape.proto.Messages.ArchiveServiceConnect;

public class Runner {

  private static final Logger logger = LoggerFactory.getLogger(Runner.class);

  public static void main(String... args) {
    ServerComponent server = DaggerServerComponent.builder()
        .messages(ImmutableList.<Message>builder()
                      .add(ArchiveServiceConnect.getDefaultInstance())
                      .build())
        .build();

    try {
      server.bootstrap()
            .bind(43594)
            .sync();

      logger.info("Bound socket to {}", 43594);
    } catch (InterruptedException ex) {
      logger.error("Failed to bind the socket", ex.getCause());
    }
  }
}
