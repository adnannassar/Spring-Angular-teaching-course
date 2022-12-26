package org.springkurs.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springkurs.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi R8");
        return veh;
    }

    @Bean
    Integer number() {
        return 12;
    }

    @Bean
    String hello() {
        return "Hallo";
    }
}
