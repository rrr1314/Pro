package com.cvs.staticTest;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 10:31:00
 */
public class Demo {

    private static int age = 10;

    public static void main(final String[] args) {
        // System.out.println(age);

        test(new AbsDemo() {
            @Override
            public void test() {
                System.out.println("我是test111");
            }
        });
    }

    public static void test(final AbsDemo a) {

        a.test();
        // test2();
    }

    public void test2() {
        System.out.println("test2");
    }
}
