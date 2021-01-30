package com.cvs;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月29日 19:28:00
 */
public class Fu {

    public String name = "父类夏天";
    private int age = 10;

    public Fu() {}

    public Fu(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    // public abstract void run();

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

    public void show() {
        System.out.println("父类方法的show");
    }
}
