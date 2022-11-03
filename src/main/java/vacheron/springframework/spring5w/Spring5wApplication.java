package vacheron.springframework.spring5w;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5wApplication {
//	have to make sure h2.console is enabled in application.properties
//	make sure you go to localhost:{port}/h2-console/ to access h2 database console
	public static void main(String[] args) {
		SpringApplication.run(Spring5wApplication.class, args);
	}

}
