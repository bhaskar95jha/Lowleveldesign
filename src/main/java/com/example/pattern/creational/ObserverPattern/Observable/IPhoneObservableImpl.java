package com.example.pattern.creational.ObserverPattern.Observable;

import com.example.pattern.creational.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int currStock = 0;


    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer:notificationAlertObserverList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(currStock == 0){
            notifySubscribers();
        }
        currStock += newStock;
    }

    @Override
    public int getStockCount() {
        return currStock;
    }
}
