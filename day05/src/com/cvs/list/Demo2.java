package com.cvs.list;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月04日 18:29:00
 */
public class Demo2<BSJ> {


    public static void main(String[] args) {
        Test1<?> objectTest1 = new Test1<>();


        // objectTest1.setName("夏天");
        // objectTest1.setAge(18);
        // System.out.println(objectTest1.toString());



        System.out.println(objectTest1.love());
    }


    public<ABE> void test1(BSJ bsj){
        System.out.println();
    }


}
