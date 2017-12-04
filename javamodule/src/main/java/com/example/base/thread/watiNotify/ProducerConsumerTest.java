package com.example.base.thread.watiNotify;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe:测试主类
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        DataHole dataHole = new DataHole();
        Producer producer = new Producer(dataHole, 1);
        Consumer consumer = new Consumer(dataHole, 1);

        producer.start();
        consumer.start();
    }

}
