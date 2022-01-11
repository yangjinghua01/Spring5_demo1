package com.yjhdemo.spring5.testdemo;

/**
 * 使用有参数构造注入
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
    public void ordersTest(){
        System.out.println("oname"+oname);
        System.out.println("address"+address);
    }
}
