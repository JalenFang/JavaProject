package com.example.concurrent;

import com.example.constant.ThreadConstant;

/**
 * author: Jalen
 * date: 2017/8/22
 * editor:
 * describe: 线程的简单使用
 */
public class SimpleThread {

    public static void main(String[] args) {
        for (int i = 0; i < ThreadConstant.NUM; i++) {
            SimpleRunnable simpleRunnable = new SimpleRunnable();
            simpleRunnable.setId(i);
            new Thread(simpleRunnable).start();
        }
    }
}
