package com.example.DesignPattern.factory.method.product;

import com.example.DesignPattern.factory.method.interfaces.Food;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe:
 */
public class Apple implements Food {
    @Override
    public void eat() {
        System.out.println("苹果真好吃，又脆又甜！");
    }
}
