package com.example.DesignPattern.factory.method;

import com.example.DesignPattern.factory.method.interfaces.Food;
import com.example.DesignPattern.factory.method.interfaces.Vehicle;

/**
 * author: jalen
 * date: 2017/10/20
 * editor:
 * date:
 * describe:
 */
public class FoodFactory extends AbstractFactory {
    @Override
    public Food createApple() {
        return null;
    }

    @Override
    public Food createOrange() {
        return null;
    }

    @Override
    public Vehicle createCar() {
        return null;
    }

    @Override
    public Vehicle createBus() {
        return null;
    }
}
