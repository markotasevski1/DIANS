package com.example.diansjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
public class DiansJavaApplication {

    public static void main(String[] args) {

        SpringApplication.run(DiansJavaApplication.class, args);
        System.out.println("hello");
    }

}
