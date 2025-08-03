package com.okestro.demo17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Demo17Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo17Application.class, args);
    }

}
