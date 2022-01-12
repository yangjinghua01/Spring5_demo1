package com.yjhdemo.spring5.bean;
//员工类
public class Emp {
    private String ename;
    private String gender;
//员工属于某个部门
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void out(){
        System.out.println("姓名"+ename);
        System.out.println("性别"+gender);
        System.out.println("部门"+dept.toString());
    }
}
