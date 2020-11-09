package com.example.mongodbtests.Users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(Repo repo) {
        return args -> {
            repo.save(new User(1, "Janis", "My team", 123L));
            repo.save(new User(2, "Marek", "Other Team", 345L));
            repo.save(new User(3, "Zdzich", "Andere", 413L));
        };
    }
}
