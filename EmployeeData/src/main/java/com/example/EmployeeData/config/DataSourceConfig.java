package com.example.EmployeeData.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:postgresql://localhost:5432/Employee_DB")
                .username("postgres")
                .password("1234")
                .build();
    }

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:postgresql://localhost:5432/Employee_DB")
                .username("postgres")
                .password("1234")
                .build();
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:postgresql://localhost:5432/Employee_DB")
                .username("postgres")
                .password("1234")
                .build();
    }
}
