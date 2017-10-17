package com.example.DesignPattern.observer;

import com.example.DesignPattern.observer.interfaces.Observer;
import com.example.DesignPattern.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 天气信息的实体类
 */
public class WeatherData implements Subject {
    private List<Observer> observersList;

    private float temperature; // 温度
    private float humidity; // 湿度
    private float pressure; // 气压


    public WeatherData() {
        observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null && observersList != null) {
            observersList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer != null && observersList != null && !observersList.isEmpty()) {
            observersList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if (observersList != null && !observersList.isEmpty()) {
            for (Observer observer : observersList) {
                if (observer != null) {
                    observer.update(temperature, humidity, pressure);
                }
            }
        }
    }

    public void setData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyDataChange();
    }

    private void notifyDataChange() {
        notifyObservers();
    }
}
