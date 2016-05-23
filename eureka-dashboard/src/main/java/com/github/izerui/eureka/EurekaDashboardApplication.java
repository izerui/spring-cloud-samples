package com.github.izerui.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by serv on 16/5/20.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class EurekaDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDashboardApplication.class,args);
    }
}
