package zuoye;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 17:57:00
 */


public class Test {
    //1.正常情况我需要写一个Star接口的实现类
    public static class StarImp implements Star{
        @Override
        public Star paixi() {
            return null;
        }
    }

    public void test(){
        //2.然后去new Star的实现类
        Star ss = new StarImp();
    }


    public static void main(final String[] args) {
        //现在可以直接使用匿名内部类的方法 相当于把上面两个步骤合在一起了
        Star st = new Star(){
            @Override
            public Star paixi() {
                return null;
            }
        };

    }













    public static Star star(final Star star) {

        System.out.println("123");

        System.out.println(star);;
        // star.paixi();
        return star;
    }

}
