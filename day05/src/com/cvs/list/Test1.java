package com.cvs.list;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月04日 17:49:00
 */
public class Test1<BMW> {


    private String name;
    private int age;




    public Test1() {
    }

    public Test1(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BMW love(){

        return (BMW) "夏天";
    }

}
