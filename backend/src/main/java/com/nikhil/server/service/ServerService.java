package com.nikhil.server.service;

import com.nikhil.server.Entity.Server;

import java.io.IOException;
import java.util.List;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    List<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
