package com.yjhdemo.spring5.collecttiontype;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Book {
    private List<String>list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void test(){
        System.out.println(list);
    }
}
