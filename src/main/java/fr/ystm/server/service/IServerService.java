package fr.ystm.server.service;

import fr.ystm.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface IServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> getServersList(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
