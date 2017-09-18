package com.develcom.servicios.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.develcom.servicios")
@EnableJpaRepositories(basePackages = "com.develcom.persistencia.repositorios")
@EntityScan(basePackages = "com.develcom.persistencia")
public class Dw4JServiciosApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dw4JServiciosApplication.class, args);
    }
}
