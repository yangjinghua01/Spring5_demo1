package com.yjhdemo.spring5.testdemo;

import com.yjhdemo.spring5.User;
import com.yjhdemo.spring5.collecttiontype.Course;
import com.yjhdemo.spring5.collecttiontype.Stu;
import com.yjhdemo.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testspring5 {
    @Test
    public void addTest(){
//        加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
//        获取配置创建的对象
        User user = context.getBean("usersss", User.class);
        System.out.println(user);
        user.addUser();
    }
    @Test
    public void testBook1(){
//        加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
//        获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrders(){
//        加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
//        获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
    @Test
    public void testbooks(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
        Books books = context.getBean("books",Books.class);
        System.out.println(books);
        books.testdemo();
    }
    @Test
    public void teststu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanOne.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
        stu.out();
    }
    @Test
    public void teststu1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beantow.xml");
        com.yjhdemo.spring5.collecttiontype.Book book = context.getBean("book", com.yjhdemo.spring5.collecttiontype.Book.class);
        System.out.println(book);
        book.test();
    }
    @Test
    public void teststu3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beanthree.xml");
        Course myBean = context.getBean("Mybean", Course.class);
        System.out.println(myBean);
//        book.test();
    }
}
