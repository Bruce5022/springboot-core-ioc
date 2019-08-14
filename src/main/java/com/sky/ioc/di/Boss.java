package com.sky.ioc.di;

import org.springframework.stereotype.Component;

@Component
public class Boss {

    private Car car;




    public Boss( Car car){
        this.car=car;
    }

    public Car getCar() {
        return car;
    }

//    @Autowired
    public void setCar( Car car) {
        this.car = car;
    }
}
