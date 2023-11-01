package gusystem.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import gusystem.api.domain.User;
import gusystem.api.repository.GuRepository;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private GuRepository repository;

	@Bean
	public void StartDB() {
		User u1 = new User(null, "gustavo", "gustavoferrazpompeo@gmail.com", "123");
		User u2 = new User(null, "luiz", "luiz@gmail.com", "321");
		
		repository.saveAll(List.of(u1,u2));
	}
}
