package com.cvs.list;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年02月04日 21:27:00
 */
public class T5<ABE> implements T3<ABE> {

    @Override
    public ABE test() {
        return (ABE)"!23";
    }

    @Override
    public ABE test(ABE t3) {
        return t3;
    }

}
