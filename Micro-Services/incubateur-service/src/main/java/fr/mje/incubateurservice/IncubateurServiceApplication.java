package fr.mje.incubateurservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IncubateurServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncubateurServiceApplication.class, args);
    }
}