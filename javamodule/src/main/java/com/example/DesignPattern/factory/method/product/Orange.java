package com.example.DesignPattern.factory.method.product;

import com.example.DesignPattern.factory.method.interfaces.Food;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe:
 */
public class Orange implements Food {
    @Override
    public void eat() {
        System.out.println("橘子真好吃，又酸又甜！");
    }
}
