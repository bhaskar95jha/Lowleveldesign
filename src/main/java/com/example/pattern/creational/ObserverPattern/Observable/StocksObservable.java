package com.example.pattern.creational.ObserverPattern.Observable;

import com.example.pattern.creational.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStock);
    int getStockCount();
}
