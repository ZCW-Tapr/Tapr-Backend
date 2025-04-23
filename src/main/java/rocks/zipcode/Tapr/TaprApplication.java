package rocks.zipcode.Tapr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rocks.zipcode.Tapr.User.User;
import rocks.zipcode.Tapr.User.UserRepository;

@SpringBootApplication
public class TaprApplication {

	private static final Logger log = LoggerFactory.getLogger(TaprApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaprApplication.class);
	}

	@Bean
	public CommandLineRunner user(UserRepository repository) {
		return (args) -> {
			repository.save(new User(1, "KDot234", "kris@zcw.com", "Kris", "Younger", "K.2345", 302-763-3333));
			repository.save(new User(2, "Gpop67", "gcru123@zcw.net", "Gabe", "Cruz", "G.1234", 302-763-2234));
			repository.save(new User(3, "PMango", "MangoP543@zcw.net", "Paulie", "Mango", "P543c278?", 302-763-6677));
		};


		// fetch all users
		log.info("Users found with findAll():");
		log.info("-------------------------------");
		repository.findAll().forEach(user -> {
			log.info(user.toString());
		});
		log.info("");

		// fetch an individual user by ID
		User user = repository.findById(2);
		log.info("User found with findById(2):");
		log.info("--------------------------------");
		log.info(user.toString());
		log.info("");

		// fetch users by username
		log.info("User found with findByUsername('KDot234'):");
		log.info("--------------------------------------------");
		repository.findByUsername("KDot234").forEach(KDot234 -> {
			log.info(KDot234.toString());
		});
		log.info("");

		// fetch users by email
		log.info("User found with findByEmail('kris@zcw.com'):");
		log.info("--------------------------------------------");
		repository.findByEmail("kris@zcw.com").forEach(Kris -> {
			log.info("kris@zcw.com".toString());
		});
		log.info("");

		// fetch users by first name
		log.info("User found with findByFirstName('Kris'):");
		log.info("--------------------------------------------");
		repository.findByFirstName("Kris").forEach(Kris -> {
			log.info(Kris.toString());
		});
		log.info("");

		// fetch users by password
		log.info("User found with findByPassword('K.2345'):");
		log.info("--------------------------------------------");
		repository.findByPassword("K.2345").forEach(KDot234 -> {
			log.info(KDot234.toString());
		});
		log.info("");

		// fetch users by last name
		log.info("User found with findByLastName('Younger'):");
		log.info("--------------------------------------------");
		repository.findByLastName("Younger").forEach(Younger -> {
			log.info(Younger.toString());
		});
		log.info("");

		// fetch users by phone number
		log.info("User found with findByPhoneNumber('302-763-3333'):");
		log.info("--------------------------------------------");
		repository.findByPhoneNumber("302-763-3333").forEach(Kris -> {
			log.info("302-763-3333".toString());
		});
		log.info("");
	};
}
