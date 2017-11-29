package com.example.DesignPattern.factory.method.product;

import com.example.DesignPattern.factory.method.interfaces.Vehicle;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe:
 */
public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println("不喜欢高峰期的公交车 太拥挤！");
    }
}
