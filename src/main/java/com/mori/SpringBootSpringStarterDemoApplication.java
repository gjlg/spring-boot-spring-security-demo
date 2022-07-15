package com.mori;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.mori.mapper")
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebMvc
public class SpringBootSpringStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSpringStarterDemoApplication.class, args);
    }

}
