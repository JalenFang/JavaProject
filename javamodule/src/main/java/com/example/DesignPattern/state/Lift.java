package com.example.DesignPattern.state;

/**
 * author: jalen
 * date: 2017/10/9
 * editor:
 * date:
 * describe:
 */
public class Lift {
    //定义出所有的电梯状态
    public static final CloseState CLOSE_STATE = new CloseState();
    public static final OpenState OPEN_STATE = new OpenState();
    public static final RunState RUN_STATE = new RunState();
    public static final StopState STOP_STATE = new StopState();

    //当前电梯的状态
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setLift(this);
    }

    public void close() {
        this.liftState.close();
    }

    public void open() {
        this.liftState.open();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
