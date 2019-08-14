package com.sky.ioc.lifecycle;

public class Car {

    {
        System.out.println("匿名构造方法");
    }

    static {
        System.out.println("静态代码块");
    }

    public Car() {
        System.out.println("构造方法");

    }

    public void init(){
        System.out.println("car------init()------");
    }

    public void destroy(){
        System.out.println("car------destroy()------");
    }
}
