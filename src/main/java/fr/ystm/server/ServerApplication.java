package fr.ystm.server;

import fr.ystm.server.enumeration.Status;
import fr.ystm.server.model.Server;
import fr.ystm.server.repository.IServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Bean
	CommandLineRunner run(IServerRepository serverRepo) {
		return args -> {
			serverRepo.save(new Server(null,"192.168.1.160","Ubuntu","16 GB","Personal PC",
					"http://localhost:8080/server/images/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null,"192.168.1.58","Fedora","8 GB","Dell PC",
					"http://localhost:8080/server/images/server3.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null,"192.168.1.21","MacOs","32 GB","HP PC",
					"http://localhost:8080/server/images/server2.png", Status.SERVER_UP));
		};
	}


}
