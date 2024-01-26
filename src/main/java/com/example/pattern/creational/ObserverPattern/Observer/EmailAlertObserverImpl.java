package com.example.pattern.creational.ObserverPattern.Observer;

import com.example.pattern.creational.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable observable;
    String emailId;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        observable = stocksObservable;
    }

    @Override
    public void update() {
        int stockCount = observable.getStockCount();
        System.out.println("Message sent to  : "+emailId+" :Product is in stock hurry up! ");
    }

}
