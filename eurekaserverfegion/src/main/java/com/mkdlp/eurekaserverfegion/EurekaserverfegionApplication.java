package com.mkdlp.eurekaserverfegion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaserverfegionApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverfegionApplication.class, args);
    }

}
