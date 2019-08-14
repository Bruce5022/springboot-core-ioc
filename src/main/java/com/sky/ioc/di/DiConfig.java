package com.sky.ioc.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.sky.ioc.di"})
public class DiConfig {


//    @Primary
    @Bean
    public BookDao bookDao02(Car car){
        return new BookDao();
    }

}
