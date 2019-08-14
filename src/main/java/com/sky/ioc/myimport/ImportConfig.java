package com.sky.ioc.myimport;

import com.sky.ioc.condition.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 用@Import导入的类，创建出的类名是全类名：com.sky.common.myimport.Color
 */

//打印结果：
//        org.springframework.context.annotation.internalConfigurationAnnotationProcessor
//        org.springframework.context.annotation.internalAutowiredAnnotationProcessor
//        org.springframework.context.annotation.internalCommonAnnotationProcessor
//        org.springframework.context.event.internalEventListenerProcessor
//        org.springframework.context.event.internalEventListenerFactory
//        importConfig
//        com.sky.common.myimport.Color
//        shizhanwei
//        yudingjie
@Configuration
@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class ImportConfig {


    @Bean
    public Student shizhanwei(){
        return new Student("shizhanwei",20);
    }

    /**
     * 这个类必须有一个实现了condition接口的类，如果实现了condition接口，能判断是否条件成立，成立创建bean到ioc容器
     * @return
     */
    @Bean
    public Student yudingjie(){
        return new Student("yudingjie",11);
    }
}
