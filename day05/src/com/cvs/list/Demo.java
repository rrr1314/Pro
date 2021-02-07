package com.cvs.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月04日 17:32:00
 */
public class Demo {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("{");

        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<Object> objects = new LinkedList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");


        for(String a : arrayList){
            sb.append("\"").append(a).append("\"").append(":").append("\"").append(a).append("\", ");
        }


        String s = sb.substring(0, sb.length()-2) + "}";

        System.out.println(s);


        Test1<String> objectTest1 = new Test1<>();


        objectTest1.setAge(18);
        objectTest1.setName("夏天");
        System.out.println(objectTest1.toString());

    }
}
