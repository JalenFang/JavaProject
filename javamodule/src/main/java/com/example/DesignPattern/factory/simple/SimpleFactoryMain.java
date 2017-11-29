package com.example.DesignPattern.factory.simple;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe: 简单工厂方法的测试入口
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        Dragon dragon = (Dragon) simpleFactory.create(Dragon.class);
        if (dragon != null) {
            dragon.run();
        }

        Broom broom = (Broom) simpleFactory.create(Broom.class);
        if (broom != null) {
            broom.run();
        }
    }
}
