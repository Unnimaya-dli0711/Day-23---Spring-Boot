package com.example.EmployeeData.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class LoggingConfig {
    @Bean
    @Profile("dev")
    public Logger devLogger(){
        return LoggerFactory.getLogger("DevLogger");
    }

    @Bean
    @Profile("prod")
    public Logger prodLogger(){
        return LoggerFactory.getLogger("ProdLogger");
    }
}
