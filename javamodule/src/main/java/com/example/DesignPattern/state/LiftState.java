package com.example.DesignPattern.state;

/**
 * author:jalen
 * date: 2017/10/9
 * editor:
 * date:
 * describe:
 */
public abstract class LiftState {

    public Lift lift;

    public void setLift(Lift lift) {
        this.lift = lift;
    }

    public abstract void close();

    public abstract void open();

    public abstract void run();

    public abstract void stop();
}
