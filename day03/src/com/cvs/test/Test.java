package com.cvs.test;


import jdk.nashorn.internal.parser.DateParser;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.logging.SimpleFormatter;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月01日 17:48:00
 */
public class Test {


    private String name;
    private int age;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Test t = (Test) obj;

        return this.getName().equals(t.getName()) && age == t.getAge();
    }

    public static void main(String[] args) {



        BigDecimal bb = new BigDecimal("123.99");
            BigDecimal dd = new BigDecimal("500.98");


        //加
        System.out.println(bb.add(dd));

        //减
        System.out.println(bb.subtract(dd));

        //乘
        System.out.println(bb.multiply(dd));

        //除
        System.out.println(bb.divide(dd,2,RoundingMode.HALF_UP));//保留两位小数 四舍五入























        BigDecimal iii = new BigDecimal("999.98");

        BigDecimal sss = new BigDecimal("30");

        //加
        System.out.println(iii.add(sss));

        //减
        System.out.println(iii.subtract(sss));


        //乘
        System.out.println(iii.multiply(sss));

        //除
        System.out.println(iii.divide(sss,2, RoundingMode.HALF_UP));//保留2位小数    四舍五入
        System.out.println(iii.divide(sss,3, RoundingMode.HALF_DOWN));//保留3位小数  五舍六如
        System.out.println(iii.divide(sss,2, RoundingMode.HALF_EVEN));

        System.out.println("开始---");
        long star = System.currentTimeMillis();
        num();

        long end = System.currentTimeMillis();
        System.out.println("---结束");

        System.out.println("一万次循环需要: " + (end - star) + "毫秒");

        System.out.println(Math.max(1,20));
        System.out.println(Math.min(1,20));
        System.out.println(Math.random() *10);
        System.out.println(Math.pow(3,3));

        System.out.println(Math.ceil(3.1));


        HashMap<Object, Object> map = new HashMap<>();


        Calendar cd = Calendar.getInstance();


        // System.out.println(cd.get(Calendar.YEAR));
        // System.out.println(cd.get(Calendar.MONTH));
        // int day = cd.get(Calendar.DAY_OF_MONTH);
        //
        // System.out.println(cd.get(Calendar.HOUR_OF_DAY));
        // System.out.println(cd.get(Calendar.MINUTE));
        // System.out.println(cd.get(Calendar.SECOND));

        cd.set(Calendar.MONTH,2);


        System.out.println(cd.get(Calendar.YEAR)+"年" + cd.get(Calendar.MONTH)+"月" + cd.get(Calendar.DAY_OF_MONTH)+"日" +  cd.get(Calendar.HOUR_OF_DAY)+"时" + cd.get(Calendar.MINUTE)+"分" + cd.get(Calendar.SECOND)+"秒");

        cd.get(Calendar.DAY_OF_WEEK);
        System.out.println("今天" + day(cd.get(Calendar.DAY_OF_WEEK)));



        try {
            String  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String  sdfPd = String.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdf));
            map.put("格式化时间", sdf);
            map.put("将时间转为时间戳", sdfPd);

            System.out.println(map);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static String day(int num){

        String [] week = new String[]{"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

        return week[--num];
    }


    public static void num (){
        for (int i = 1; i <= 10000; i++) {
            // System.out.println(i);
        }

        System.out.println("结束");
    }
}
