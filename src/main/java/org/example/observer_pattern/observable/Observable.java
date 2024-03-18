package org.example.observer_pattern.observable;

import org.example.observer_pattern.observer.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
