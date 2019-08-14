package com.sky.ioc;

import com.sky.ioc.condition.ConditionConfig;
import com.sky.ioc.condition.Student;
import com.sky.ioc.di.Boss;
import com.sky.ioc.di.DiConfig;
import com.sky.ioc.factorybean.FactoryBeanConfig;
import com.sky.ioc.lifecycle.LifeCycleConfig;
import com.sky.ioc.myimport.ImportConfig;
import com.sky.ioc.property.People;
import com.sky.ioc.property.PropertyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class MainTest {

    public static void main(String[] args) {
        awareTest();
    }

    public static void condtionTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        Map<String, Student> beans = context.getBeansOfType(Student.class);
        System.out.println(beans);
//       结果： {shizhanwei={"age":20,"id":0,"name":"shizhanwei"}}
    }

    public static void importTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    public static void facortyBeanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("============================================");
        // 看到的是colorFactoryBean，实际bean的类型是Color，并且单实例
        System.out.println(context.getBean("colorFactoryBean"));
        System.out.println(context.getBean("colorFactoryBean"));
        System.out.println("============================================");
        // 如果想得到colorFactoryBean的实例，怎么得到呢？
        System.out.println(context.getBean("&colorFactoryBean"));
    }

    public static void lifeCycleTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ((AnnotationConfigApplicationContext) context).close();
    }

    public static void propertyTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertyConfig.class);
        People people = context.getBean(People.class);
        System.out.println(people);

    }

    public static void diTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
//        Map<String, BookDao> books = context.getBeansOfType(BookDao.class);
//        System.out.println(books);
//        System.out.println("==========================");
//        BookService bookService = context.getBean(BookService.class);
//        bookService.print();
//        System.out.println("==========================");
        Boss boss = context.getBean(Boss.class);
        System.out.println(boss.getCar());

    }


    public static void awareTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        System.out.println(context);
    }
}
