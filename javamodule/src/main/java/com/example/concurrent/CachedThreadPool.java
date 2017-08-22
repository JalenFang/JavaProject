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
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < ThreadConstant.NUM; i++) {
            SimpleRunnable simpleRunnable = new SimpleRunnable();
            simpleRunnable.setId(i);
            executorService.execute(simpleRunnable);
        }
        //这个方法的调用可以防止新任务被提交给这个Executor main线程将继续运行在shutdown被调用之前提交的所有任务
        executorService.shutdown();
    }
}
