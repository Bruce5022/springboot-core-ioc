package com.sky.ioc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean, DisposableBean {

    {
        System.out.println("dog匿名构造方法");
    }

    static {
        System.out.println("dog静态代码块");
    }

    public Dog() {
        System.out.println("dog构造方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("dog===destroy===");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dog===afterPropertiesSet===");
    }
}
