package com.cvs.test;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月25日 14:38:00
 */
public class Student {

    //学生姓名
    private String name;
    //学生年龄
    private String age;
    //学生ID
    private String id;
    //学生地址
    private String address;


    public Student() {
    }

    public Student(final String id, final String name, final String age, final String address) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
    }


    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(final String age) {
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}
