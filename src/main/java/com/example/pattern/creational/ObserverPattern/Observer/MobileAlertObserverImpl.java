package com.example.pattern.creational.ObserverPattern.Observer;

import com.example.pattern.creational.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable observable;
    String mobileNumber;

    public MobileAlertObserverImpl(String mobileNumber,StocksObservable stocksObservable){
        this.mobileNumber = mobileNumber;
        observable = stocksObservable;
    }

    @Override
    public void update() {
        //int stockCount = observable.getStockCount();
        System.out.println("Message sent to  : "+mobileNumber+" : Product is in stock hurry up! ");
    }

}
