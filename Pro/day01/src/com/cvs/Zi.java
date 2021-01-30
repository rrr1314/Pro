package com.cvs;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月29日 19:30:00
 */
public class Zi extends Fu {

    private String name = "属性夏天";

    @Override
    public void show() {

        final String name = "方法夏天";

        System.out.println("show方法");
    }

    public void show2() {

        super.show();
    }

}
