package zuoye;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 18:27:00
 */
public class Dudu extends Dog implements Star {
    public Dudu(final String name, final int age) {
        super(name, age);
    }

    public Dudu() {}

    @Override
    public Star paixi() {

        System.out.println("摩托");
        return null;
    }
}
