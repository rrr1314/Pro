package zuoye;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 17:57:00
 */
public class Test {

    public static void main(final String[] args) {

        final Dudu du = new Dudu();

        final Star star = star(new Star() {
            @Override
            public Star paixi() {
                System.out.println("重写px方法!!!");
                return star(new Star() {
                    @Override
                    public Star paixi() {
                        return null;
                    }
                });
            }
        }.paixi());
        // star.paixi();
        // star.setName("嘟嘟");
        // star.setAge(3);

        if (star instanceof Cat) {
            final Cat cat = (Cat)star;
            cat.cry();
        } else if (star instanceof Dog) {
            final Dog dog = (Dog)star;

        } else if (star instanceof Dudu) {
            final Dudu dudu = (Dudu)star;
            // dudu.paixi();
        }

        // System.out.println(star.getName());
        // System.out.println(star.getAge());

    }

    public static Star star(final Star star) {

        System.out.println("123");

        System.out.println(star);;
        // star.paixi();
        return star;
    }

}
