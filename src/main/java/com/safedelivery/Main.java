package com.safedelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(
    basePackages = {"com.safedelivery"}
)
@SpringBootApplication
public class Main {

    public static void main(String arg[]) {
        SpringApplication.run(Main.class, arg);
    }

}
