package com.example.DesignPattern.factory.method;

import com.example.DesignPattern.factory.method.interfaces.Food;
import com.example.DesignPattern.factory.method.interfaces.Vehicle;

/**
 * author:jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe:
 */
public abstract class AbstractFactory {
    public abstract Food createApple();

    public abstract Food createOrange();

    public abstract Vehicle createCar();

    public abstract Vehicle createBus();
}
