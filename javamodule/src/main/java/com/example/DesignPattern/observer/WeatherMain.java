package com.example.DesignPattern.observer;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 观察者入口
 */
public class WeatherMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new TemperatureDisplay(weatherData);

        weatherData.setData(23, 83, 100);
    }
}
