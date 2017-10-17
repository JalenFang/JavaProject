package com.example.DesignPattern.proxy;

import com.example.DesignPattern.proxy.interfaces.Visitor;

/**
 * author:jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe:管理员
 */
public class Manager implements Visitor {
    @Override
    public void visit() {
        System.out.println("我是一名管理员 我访问了这个主题");
    }

    @Override
    public void comment() {
        System.out.println("我是一名管理员 我评论了这个主题");
    }
}
