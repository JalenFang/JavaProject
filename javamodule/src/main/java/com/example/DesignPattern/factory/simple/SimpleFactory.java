package com.example.DesignPattern.factory.simple;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe: 简单工厂
 */
public class SimpleFactory {

    public Object create(Class<?> clazz) {
        if (clazz != null) {
            if (clazz.getName().equals(Dragon.class.getName())) {
                return createDragon();
            } else if (clazz.getName().equals(Broom.class.getName())) {
                return createBroom();
            }
        }
        return null;
    }

    private Dragon createDragon() {
        return new Dragon();
    }

    private Broom createBroom() {
        return new Broom();
    }
}
