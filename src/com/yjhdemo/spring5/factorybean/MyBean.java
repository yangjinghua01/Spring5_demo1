package com.yjhdemo.spring5.factorybean;

import com.yjhdemo.spring5.collecttiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean <Course>{
//
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("456");
        return course;
    }
//定义返回bean
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
