package com.cvs.list;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月04日 20:40:00
 */
public class T1 {

    public static void main(String[] args) {


        test2();

        // System.out.println(it.next());
        //
        // System.out.println(it.next());
        //
        // System.out.println(it.hasNext());


        // for (String s : c){
        //     System.out.println(s);
        // }
        //
        // System.out.println("----");
        //
        // while (it.hasNext()){
        //     System.out.println(it.next());
        // }



        Collection<String> sc = new ArrayList();
        sc.add("abc");
         /*
        //运行时期的问题被转好到了编译时期
        c.add(1);
        c.add('a');
        c.add(true);
        */
        //使用迭代器遍历，获取该集合中的内容

        //获取迭代器  并记录长度
        Iterator<String> ic = sc.iterator();

        while (ic.hasNext()){
            char ca =   ic.next().charAt(0);
            System.out.println(ca);
        }


        T2<String> t2 = new T2<>();


        // t2.test("333");
        //
        // System.out.println(t2.test2("444"));


        T5 t5 = new T5();

        System.out.println(t5.test());
        System.out.println(t5.test("123"));
    }

    private static void test2() {
        Collection<String> c = new ArrayList<>();

        c.add("a");
        c.add("b");
        c.add("c");

        //获取迭代器
        Iterator<String> it = c.iterator();
    }
}
