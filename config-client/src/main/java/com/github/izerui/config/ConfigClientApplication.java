package com.github.izerui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by serv on 16/5/20.
 */
@SpringBootApplication
public class ConfigClientApplication implements CommandLineRunner{

    @Value("${user.username}")
    String username;
    @Value("${apply.message}")
    String applyMessage;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(username);
        System.out.println(applyMessage);
    }
}
