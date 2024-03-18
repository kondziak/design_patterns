package org.example.observer_pattern.observer;

import org.example.observer_pattern.observable.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf("Internet - nowa prognoza pogody: temperatura: %d stopni, ciśnienie: %shPa\n",
                weatherForecast.getTemperature(),weatherForecast.getPressure());
    }
}
