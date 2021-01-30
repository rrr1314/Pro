package com.cvs.zuoye;

/**
 * @author 夏天
 * @version 1.0.0
 * @createTime 2021年01月30日 17:57:00
 */
public class Test {

    public static void main(final String[] args) {

        final Animal animal = animal("狗");

        animal.setName("嘟嘟");
        animal.setAge(3);

        if (animal instanceof Cat) {

            final Cat cat = (Cat)animal;

            cat.cry();
        } else if (animal instanceof Dog) {
            final Dog dog = (Dog)animal;

            final Dudu dudu = (Dudu)dog;

            dudu.paixi();
        }

        System.out.println(animal.getName());
        System.out.println(animal.getAge());

    }

    public static Animal animal(final String type) {

        if ("狗".equals(type)) {
            return new Dog();
        } else if ("猫".equals(type)) {
            return new Cat();
        }

        return null;
    }
}
