package com.example.DesignPattern.factory.method.product;

import com.example.DesignPattern.factory.method.interfaces.Vehicle;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe:
 */
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("喜欢高档舒适的小轿车！");
    }
}
