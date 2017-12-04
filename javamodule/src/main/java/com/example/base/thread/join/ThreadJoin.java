package com.example.base.thread.join;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe:线程间协作
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Thread myThread = new MyThread("myThread");
        myThread.start();
        System.out.println("main start");
        try {
//            myThread.join();//等待此线程死亡 永远等待
            myThread.join(10);//等待此线程死亡 等待时间10ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }

    private static class MyThread extends Thread {
        MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    try {
                        sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + " i = " + i);
            }
        }
    }
}
