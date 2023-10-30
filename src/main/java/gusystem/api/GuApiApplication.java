package gusystem.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableSpringDataWebSupport
@SpringBootApplication
@ComponentScan
public class GuApiApplication {

	public static void main(String[] args) {
        SpringApplication.run(GuApiApplication.class, args);
	}

}
