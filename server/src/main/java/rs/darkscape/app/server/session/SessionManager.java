package rs.darkscape.app.server.session;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class SessionManager {

  private final Map<UUID, Session> sessions = new ConcurrentHashMap<>();

  public SessionManager() { }

  public void register(Session session) {
    sessions.put(session.getUUID(), session);
  }

  public void unregister(UUID uuid) {
    sessions.remove(uuid);
  }

  public Session get(UUID uuid) {
    return sessions.get(uuid);
  }
}
