package com.emailgateway.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmailGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailGatewayApplication.class, args);
    }

    //Set your email id and password in application.properties
    //Go to Google Account -> Security -> Less secure app access -> Turn on
}
