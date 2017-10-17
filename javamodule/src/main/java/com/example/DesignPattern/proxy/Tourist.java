package com.example.DesignPattern.proxy;

import com.example.DesignPattern.proxy.interfaces.Visitor;

/**
 * author:jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe:游客
 */
public class Tourist implements Visitor {
    @Override
    public void visit() {
        System.out.println("我是一名游客 我访问了这个主题");
    }

    @Override
    public void comment() {
        System.out.println("我是一名游客 我评论了这个主题");
    }
}
