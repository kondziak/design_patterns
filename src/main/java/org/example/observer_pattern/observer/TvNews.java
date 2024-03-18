package org.example.observer_pattern.observer;

import org.example.observer_pattern.observable.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf("Telewizja - nowa prognoza pogody: temperatura: %d stopni, ciśnienie: %shPa\n",
                weatherForecast.getTemperature(),weatherForecast.getPressure());
    }
}
