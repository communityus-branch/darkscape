package rs.darkscape.app.server.pipeline;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OutboundExceptionHandler_Factory implements Factory<OutboundExceptionHandler> {
  private static final OutboundExceptionHandler_Factory INSTANCE =
      new OutboundExceptionHandler_Factory();

  @Override
  public OutboundExceptionHandler get() {
    return provideInstance();
  }

  public static OutboundExceptionHandler provideInstance() {
    return new OutboundExceptionHandler();
  }

  public static OutboundExceptionHandler_Factory create() {
    return INSTANCE;
  }

  public static OutboundExceptionHandler newOutboundExceptionHandler() {
    return new OutboundExceptionHandler();
  }
}
