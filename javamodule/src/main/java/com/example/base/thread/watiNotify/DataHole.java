package com.example.base.thread.watiNotify;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe: 共享数据
 */
public class DataHole {
    private int seq;//共享数据
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notify();
        return seq;
    }

    public synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        seq = value;
        available = true;
        notify();
    }
}
