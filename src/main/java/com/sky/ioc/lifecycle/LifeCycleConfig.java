package com.sky.ioc.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {


//    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }
    @Bean
    public Dog dog() {
        return new Dog();
    }

//    @Bean
    public Chick chick() {
        return new Chick();
    }

    @Bean
    public MyBeanPostProfessor myBeanPostProfessor() {
        return new MyBeanPostProfessor();
    }


    @Bean
    public PingPang pingPang() {
        return new PingPang();
    }}
