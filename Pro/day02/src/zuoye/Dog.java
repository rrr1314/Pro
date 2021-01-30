package zuoye;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 17:54:00
 */
public class Dog extends Animal {

    public Dog(final String name, final int age) {
        super(name, age);
    }

    public Dog() {}

    public void cry() {
        System.out.println("汪汪汪");
    }
}
