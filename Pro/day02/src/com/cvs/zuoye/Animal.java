package com.cvs.zuoye;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 17:51:00
 */
public abstract class Animal {

    private String name;
    private int age;

    public Animal(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {}

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void chi() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }
}
