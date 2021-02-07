package com.cvs.bean;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月02日 09:55:00
 */
public class Student extends Person{

    public Student() {
    }

    public Student(int id, String name, String sex, int age, String address, String number, String shengri) {
        super(id, name, sex, age, address, number, shengri);
    }

    @Override
    public String getType(){

        return "";
    }

    @Override
    public String getWook(){
        return "";
    }

}
