package com.github.izerui.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by serv on 16/5/20.
 */
@SpringBootApplication
public class Application implements CommandLineRunner{

    @Value("${user.username}")
    String username;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(username);
    }
}
