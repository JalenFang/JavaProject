package com.example.DesignPattern.observer.interfaces;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 订阅接口
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
