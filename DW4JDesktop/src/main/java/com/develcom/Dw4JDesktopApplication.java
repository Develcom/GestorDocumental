package com.develcom;

import com.develcom.cliente.util.Propiedades;
import com.develcom.cliente.util.RecursosExternos;
import com.develcom.cliente.util.SesionGlobal;
import com.develcom.login.Login;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
//@ComponentScan(basePackages = "com.develcom.cliente")
public class Dw4JDesktopApplication {

    private static ConfigurableEnvironment environment;

    public static void main(String[] args) {

        String appPath = System.getProperties().getProperty("user.dir");
        appPath = appPath.replaceAll("\\\\", "/");

//        ConfigurableApplicationContext context = SpringApplication.run(Dw4JDesktopApplication.class, args);
//        ConfigurableApplicationContext context = new SpringApplicationBuilder(Dw4JDesktopApplication.class);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Dw4JDesktopApplication.class);
        builder.headless(false);
        builder.web(false);
        builder.properties("spring.config.name:resources",
                "spring.config.location:" + appPath + "/recursos/");
//        builder.properties("spring.config.name:application,conf",
//                "spring.config.location:classpath:/external/properties/,classpath:/com/roufid/tutorial/configuration/");

        ConfigurableApplicationContext contex = builder.run(args);
        environment = contex.getEnvironment();

//        context.refresh();
//        context.start();
        //ConfigurableApplicationContext context = new SpringApplicationBuilder(Dw4JDesktopApplication.class).headless(false).web(false).run(args);
//        Login login = contex.getBean(Login.class);
//        login.mostrar();
        SesionGlobal.setPuerto(environment.getProperty("puerto"));
        SesionGlobal.setServidor(environment.getProperty("servidor"));
        new Login().mostrar();
    }

    @Bean
    public ConfigurableEnvironment environment() {
        return environment;
    }
}
