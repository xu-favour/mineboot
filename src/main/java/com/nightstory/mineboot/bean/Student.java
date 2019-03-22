package com.nightstory.mineboot.bean;

import javax.annotation.PostConstruct;

/**
 * @Author: putao
 * @Date: 2018/12/12
 */
public class Student implements Cloneable{
    private String id;
    private String name;
    public static void main(String[] args){
        Student student = new Student("1","hhh");
        try {
            System.out.println(student.clone() == student);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("student name" + name);
    }

    @PostConstruct
    public void test(){
        System.out.println("postConstruct");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
