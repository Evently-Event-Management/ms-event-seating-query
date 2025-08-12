package com.ticketly.mseventseatingquery;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsEventSeatingQueryApplication {

    public static void main(String[] args) {
        // Load environment variables from .env file
        Dotenv dotenv = Dotenv.configure()
                .directory("./")  // Location of .env file, defaults to project root
                .ignoreIfMissing() // Won't throw exception if .env file is not found
                .load();

        // Set environment variables from .env file
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );

        SpringApplication.run(MsEventSeatingQueryApplication.class, args);
    }

}
