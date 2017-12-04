package com.example.base.thread.yield;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe:线程让步
 */
public class ThreadYield {
    /*
    调用该方法将CPU让给具有与当前线程相同优先级的线程。
    如果没有同等优先级的线程是Runnable状态，yield( )方法将什么也不做。
     */

    public static void main(String[] args) {
        Thread thread1 = new MyThread("thread1");
        Thread thread2 = new MyThread("thread2");

        thread1.start();
        thread2.start();
    }

    private static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + " i = " + i);
                yield();
            }
        }
    }
}
