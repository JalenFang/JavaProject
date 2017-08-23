package com.example.concurrent;

import com.example.constant.ThreadConstant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author: Jalen
 * date: 2017/8/23
 * editor:
 * describe: Executors newFixedThreadPool的简单使用
 */
public class FixThreadPool {
    public static void main(String[] args) {
        //指定创建线程的数量为4
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < ThreadConstant.NUM; i++) {
            SimpleRunnable simpleRunnable = new SimpleRunnable();
            executorService.execute(simpleRunnable);
        }
    }
}
