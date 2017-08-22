package com.example.days;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Jalen
 * @date 2017/8/14
 * @editor
 * @date
 * @describe
 */
public class Day5 {
    //三个线程共享对一个 Runnable 对象，所以同步锁中其他两个线程没有执行机会。
    public static void test() {
        final TxtThread txtThread = new TxtThread();

        new Thread(txtThread).start();
        new Thread(txtThread).start();
//        new Thread(txtThread).start();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new Thread(txtThread).start();
            }
        }, 2 * 1000);
    }

    static class TxtThread implements Runnable {
        int num = 100;
        String str = new String();

        @Override
        public void run() {
            synchronized (str) {
                while (num > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println(Thread.currentThread().getName() + " this is " + num--);
                }
            }
        }
    }
}
