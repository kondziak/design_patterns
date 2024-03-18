package org.example.observer_pattern.observer;

import org.example.observer_pattern.observable.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
