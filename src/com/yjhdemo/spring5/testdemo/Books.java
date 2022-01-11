package com.yjhdemo.spring5.testdemo;

public class Books {
    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void testdemo(){
        System.out.println("名称"+bname+"其他"+bauthor+"地址"+address);
    }
}
