package com.sky.ioc.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {


    @Bean
    public Student shizhanwei(){
        return new Student("shizhanwei",20);
    }

    /**
     * 这个类必须有一个实现了condition接口的类，如果实现了condition接口，能判断是否条件成立，成立创建bean到ioc容器
     * @return
     */
    @Conditional(value = {WindowsCondition.class})
    @Bean
    public Student yudingjie(){
        return new Student("yudingjie",11);
    }
}
