package com.example.DesignPattern.state;

/**
 * author: jalen
 * date: 2017/10/9
 * editor:
 * date:
 * describe:
 */
public class CloseState extends LiftState {

    @Override
    public void close() {
        System.out.println("电梯门关闭了!");
    }

    @Override
    public void open() {
        super.lift.setLiftState(Lift.OPEN_STATE);
        super.lift.open();
    }

    @Override
    public void run() {
        super.lift.setLiftState(Lift.RUN_STATE);
        super.lift.run();
    }

    @Override
    public void stop() {
        super.lift.setLiftState(Lift.STOP_STATE);
        super.lift.stop();
    }

}
