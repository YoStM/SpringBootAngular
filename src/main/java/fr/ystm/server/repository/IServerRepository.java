package fr.ystm.server.repository;

import fr.ystm.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServerRepository extends JpaRepository<Server, Long> {
    // JPA Repo is clever enough to understand that we want to find a Server by IpAddress
    // as long as the field IpAddress exists in our class Server.
    Server findByIpAddress(String ipAddress);
}
