package com.cvs.test;

import java.util.Timer;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月01日 17:46:00
 */
public class Demo {

    private String name = "夏天";
    private int age = 18;


    public Demo() {
        System.out.println("我是构造方法");
    }


    {
        System.out.println("我是代码块");
    }

    static {
        System.out.println("我是静态代码块");
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //重写equals方法
    @Override
    public boolean equals(Object o){

        //判断地址值是否一致
        if (this == o){
            return true;
        }

        //判断类型是否一致
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        Demo d = (Demo) o;

        return d.getName().equals(((Demo) o).getName()) && d.getAge() == ((Demo) o).getAge();
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
