package com.yjhdemo.spring5.testdemo;

import com.yjhdemo.spring5.bean.Emp;
import com.yjhdemo.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
        UserService service = context.getBean("userService",UserService.class);
        System.out.println(service);
        service.add();
    }
    @Test
    public void testbean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.out();
    }
}
