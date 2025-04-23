package rocks.zipcode.Tapr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TaprApplication {

	private static final Logger log = LoggerFactory.getLogger(TaprApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaprApplication.class, args);
	}

//	public CommandLineRunner demo(UserRepository repository) {
//		return (args) -> {
//			//repository.save(new User(01, "KDot234", "kris@zcw.com", "Kris", "Younger", "K.2345", 302-766-3333, ));
//		};
//	}

}
