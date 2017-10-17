package com.example.DesignPattern.observer;

import com.example.DesignPattern.observer.interfaces.Observer;
import com.example.DesignPattern.observer.interfaces.Subject;

import java.util.Locale;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 温度展示面板
 */
public class TemperatureDisplay implements Observer {
    public TemperatureDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(java.lang.String.format(Locale.CHINESE, "温度:%f 湿度:%f 气压:%f ", temperature, humidity, pressure));
        }
        }
