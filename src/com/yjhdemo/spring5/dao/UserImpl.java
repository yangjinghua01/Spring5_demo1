package com.yjhdemo.spring5.dao;

public class UserImpl implements UserDao {

    @Override
    public void update() {
        System.out.println("dao层实现");
    }
}
