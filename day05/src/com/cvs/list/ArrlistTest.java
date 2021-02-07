package com.cvs.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月04日 20:12:00
 */




public class ArrlistTest {
    public static void main(String[] args) {


        /*
        *   public boolean add(E e)：  把给定的对象添加到当前集合中 。
            public boolean remove(E e): 把给定的对象在当前集合中删除。
            public boolean contains(Object obj): 判断当前集合是否包含给定的对象。
            public boolean isEmpty(): 判断当前集合是否为空。
            public int size(): 返回集合中元素的个数。
            public Object[] toArray(): 把集合中的元素，存储到数组中
            public void clear():清空集合中所有的元素。
        */

        ArrayList<String> arrayList = new ArrayList<>();

        String [] strArr = {"a","b","c"};

        arrayList.add("123");
        arrayList.add("456");
        arrayList.clear();
        arrayList.addAll(Arrays.asList(strArr));

        arrayList.remove("b");
        System.out.println(arrayList);

        System.out.println(arrayList.contains("a"));
        System.out.println(arrayList.contains("c"));

        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList.size());

        arrayList.add("夏天想你");

        String s = arrayList.toString();

        System.out.println(arrayList.toString());
    }
}
