package com.sky.ioc.property;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@Configuration
public class PropertyConfig {


    @Bean
    public People people() {
        return new People();
    }


}
