package com.example.concurrent;

/**
 * author: Jalen
 * date: 2017/8/22
 * editor:
 * describe: 实现Runnable执行任务
 */
class SimpleRunnable implements Runnable {
    private int countDown = 5;
    private long id;

    private String print() {
        return "当前线程" + id + "_" + (countDown > 0 ? countDown : "计时结束！") + ";";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(print());
            //对线程调度器的一种建议  可以将CPU从一个线程切换到另一个线程  这个地方使用的目的是输入更明显 不同线程一个一个的输出
            Thread.yield();
        }
    }

    void setId(long threadId) {
        this.id = threadId;
    }
}
