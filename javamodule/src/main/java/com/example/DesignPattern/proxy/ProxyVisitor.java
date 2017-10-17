package com.example.DesignPattern.proxy;

import com.example.DesignPattern.proxy.interfaces.Visitor;

/**
 * author:jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe:访问者代理
 */
public class ProxyVisitor implements Visitor {
    private Visitor visitor;

    public ProxyVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void visit() {
        if (visitor != null) {
            visitor.visit();
        }
    }

    @Override
    public void comment() {
        if (visitor instanceof Tourist) {
            System.out.println("游客不能发表评论，请先注册帐号");
            return;
        }

        visitor.comment();
    }
}
