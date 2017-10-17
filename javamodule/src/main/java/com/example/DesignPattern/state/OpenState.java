package com.example.DesignPattern.state;

/**
 * author:jalen
 * date: 2017/10/9
 * editor:
 * date:
 * describe:
 */
public class OpenState extends LiftState {
    @Override
    public void close() {

    }

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
