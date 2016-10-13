package li.koly.user;

import li.koly.user.module.User;
import li.koly.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(UserService userService) {
        return (args) -> {
            // save a couple of customers
            userService.save(new User(123456789L, "koly", "password"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            log.info(userService.getUser("koly").toString());
            log.info("");
        };
    }
}
