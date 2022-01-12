package com.yjhdemo.spring5.service;

import com.yjhdemo.spring5.dao.UserDao;
import com.yjhdemo.spring5.dao.UserImpl;

public class UserService {
//创建UserDao类型的属性生成对应的setter方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public  void add(){
        System.out.println("这是service层");
        userDao.update();
        /**
         * 原始方法
         * 创建UserDao对象
         */
        UserDao dao = new UserImpl();
        dao.update();
        /**
         * 通过spring做到
         */

    }
}
