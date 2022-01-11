package com.yjhdemo.spring5.testdemo;

/**
 * 演示使用set方法进行属性的注入
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
//    创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public static void main(String[] args) {
        Book book  = new Book();
        book.setBname("abc");
    }
    public void testDemo(){
        System.out.println(bname+"+"+bauthor);
    }
}
