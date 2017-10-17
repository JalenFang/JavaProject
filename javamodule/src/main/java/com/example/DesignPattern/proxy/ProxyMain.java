package com.example.DesignPattern.proxy;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 策略模式入口
 */
public class ProxyMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Tourist tourist = new Tourist();
        ProxyVisitor visitor;

        visitor = new ProxyVisitor(manager);
        visitor.visit();
        visitor.comment();

        visitor = new ProxyVisitor(tourist);
        visitor.visit();
        visitor.comment();
    }
}
