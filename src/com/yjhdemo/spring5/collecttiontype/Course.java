package com.yjhdemo.spring5.collecttiontype;

public class Course {
    private String cname;//课程的名称
    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
