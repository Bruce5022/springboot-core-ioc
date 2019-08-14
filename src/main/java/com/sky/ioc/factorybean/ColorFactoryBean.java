package com.sky.ioc.factorybean;


import com.sky.ioc.myimport.Color;
import org.springframework.beans.factory.FactoryBean;

// 创建一个spring定义的工厂bean
public class ColorFactoryBean implements FactoryBean<Color> {

    //返回一个color对象，这个对象会添加到容器中
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
