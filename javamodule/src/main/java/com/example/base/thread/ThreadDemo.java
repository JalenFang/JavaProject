package com.example.base.thread;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe: thread的简单使用
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < 10; i++) {
                    System.out.println("" + i);
                    try {
                        sleep((int) (Math.random() * 1000));
                    } catch (Exception e) {
//
                    }
                }
            }
        }.start();
    }
}
