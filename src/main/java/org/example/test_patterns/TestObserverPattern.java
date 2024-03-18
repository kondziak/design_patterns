package org.example.test_patterns;

import org.example.observer_pattern.observable.WeatherForecast;
import org.example.observer_pattern.observer.InternetNews;
import org.example.observer_pattern.observer.RadioNews;
import org.example.observer_pattern.observer.TvNews;

public class TestObserverPattern {

    public static void testObserverPattern() {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);
    }
}
