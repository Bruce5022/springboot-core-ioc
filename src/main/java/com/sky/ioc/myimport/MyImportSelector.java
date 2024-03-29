package com.sky.ioc.myimport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义逻辑返回需要导入的组件
 */
public class MyImportSelector implements ImportSelector {

    // 返回值，就是要导入到容器中的组件全类名
    //annotationMetadata：当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.sky.common.myimport.Blue","com.sky.common.myimport.Yellow"};
    }
}
