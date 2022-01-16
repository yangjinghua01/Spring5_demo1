package com.yjhdemo.spring5.Beans;

public class Order {
    private String oname;

    public Order() {
        System.out.println("无参构造执行");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("执行setter方法");
    }
//    创建执行初始化的方法
    public  void initmethod(){
        System.out.println("执行初始化方法");
    }
//    创建销毁的方法
    public void DestroyMethod(){
        System.out.println("执行bean销毁的方法");
    }
}
