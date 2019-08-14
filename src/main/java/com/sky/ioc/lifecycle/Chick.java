package com.sky.ioc.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chick {

    public Chick() {
        System.out.println("chick ----- constructor");
    }

    // 对象创建并赋值以后调用
    @PostConstruct
    public void init(){
        System.out.println("chick------postconstruct()------");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("chick------predestroy()------");
    }
}
