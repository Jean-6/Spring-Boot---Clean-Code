package com.example.cleancode_springboot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanCodeSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CleanCodeSpringBootApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");
    }
}
