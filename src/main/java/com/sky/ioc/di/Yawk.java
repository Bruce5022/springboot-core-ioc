package com.sky.ioc.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Yawk implements ApplicationContextAware, BeanNameAware , EmbeddedValueResolverAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的ioc容器:" + applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName:" + name);
    }

    // Spring的解析器,EL标签都是这东东来解析的
    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String stringValue = stringValueResolver.resolveStringValue("你好${os.name},数字:#{20*18}");
        System.out.println("ResolverValue:"+stringValue);
    }
}
