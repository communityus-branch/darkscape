package rs.darkscape.app.server.initializer;

import dagger.Subcomponent;

@Subcomponent(modules = ServerChannelInitializerModule.class)
public interface ServerChannelInitializerComponent {
  ServerChannelInitializer initializer();

  @Subcomponent.Builder
  interface Builder {
    ServerChannelInitializerComponent build();
  }
}
