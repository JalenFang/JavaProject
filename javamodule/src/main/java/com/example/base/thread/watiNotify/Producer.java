package com.example.base.thread.watiNotify;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe: 生产者
 */
public class Producer extends Thread {
    private DataHole dataHole;
    private int number;

    public Producer(DataHole dataHole, int number) {
        this.dataHole = dataHole;
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("Producer #" + this.number + " put: " + i);
            dataHole.put(i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {

            }
        }
    }
}
