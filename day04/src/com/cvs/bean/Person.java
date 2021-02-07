package com.cvs.bean;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月02日 09:50:00
 */
public abstract class Person {

    //ID
    private int id;

    //姓名
    private String name;

    //性别
    private String sex;

    //年龄
    private int age;

    //地址
    private String address;

    //电话号码
    private String number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getShengri() {
        return shengri;
    }

    public void setShengri(String shengri) {
        this.shengri = shengri;
    }

    public Person() {
    }

    public Person(int id, String name, String sex, int age, String address, String number, String shengri) {
        this.id  = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.number = number;
        this.shengri = shengri;
    }

    private String shengri;


    //获取职业
    public abstract String getType();

    //获取工作内容
    public abstract String getWook();
}
