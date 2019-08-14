package com.sky.ioc.factorybean;


import com.sky.ioc.condition.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {


    @Bean
    public Student shizhanwei() {
        return new Student("shizhanwei", 20);
    }

    @Bean
    public Student yudingjie() {
        return new Student("yudingjie", 11);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
