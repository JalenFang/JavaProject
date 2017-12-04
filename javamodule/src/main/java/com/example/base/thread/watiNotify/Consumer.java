package com.example.base.thread.watiNotify;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe:消费者
 */
public class Consumer extends Thread {
    private DataHole dataHole;
    private int number;

    public Consumer(DataHole dataHole, int number) {
        this.dataHole = dataHole;
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        int value = 0;
        for (int i = 0; i < 10; i++) {//不间断的连续消费10个
            value = dataHole.get();
            System.out.println("Consumer #" + this.number + " got: " + value);
        }

    }
}
