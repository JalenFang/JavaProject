package com.example.DesignPattern.state;

/**
 * author: jalen
 * date: 2017/10/9
 * editor:
 * date:
 * describe: 电梯状态切换的入口  状态模式
 */
public class LiftStateMain {

    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setLiftState(Lift.CLOSE_STATE);
//        lift.close();
        lift.open();
//        lift.stop();
//        lift.run();
    }

}
