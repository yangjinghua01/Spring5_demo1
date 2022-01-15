package com.yjhdemo.spring5.collecttiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
//1.数组类型属性
private String [] courses;
//List 集合属性
    private List<String>list;
//    Map 集合类型属性
    private Map<String,String>maps;
//    set集合类型属性
    private Set<String>sets;
    private List<Course> courseList;
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courseList=" + courseList +
                '}';
    }

    public void out(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList.toString());
    }
}
