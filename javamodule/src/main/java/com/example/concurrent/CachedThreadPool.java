package com.example.concurrent;

import com.example.constant.ThreadConstant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author: Jalen
 * date: 2017/8/22
 * editor:
 * describe:Executors  newCachedThreadPool的简单使用
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        //为每一个任务都创建一个线程 然后在回收旧线程时 停止创建新线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < ThreadConstant.NUM; i++) {
            SimpleRunnable simpleRunnable = new SimpleRunnable();
            executorService.execute(simpleRunnable);
        }
        //这个方法的调用可以防止新任务被提交给这个Executor main线程将继续运行在shutdown被调用之前提交的所有任务
        executorService.shutdown();

        //java.util.concurrent.RejectedExecutionException  提交的任务被线程池拒绝了

        /*SimpleRunnable runnable = new SimpleRunnable();
        runnable.setId(6);
        executorService.execute(runnable);*/
    }
}
