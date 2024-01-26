package com.example.pattern.creational.ObserverPattern;

import com.example.pattern.creational.ObserverPattern.Observable.IPhoneObservableImpl;
import com.example.pattern.creational.ObserverPattern.Observable.StocksObservable;
import com.example.pattern.creational.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.example.pattern.creational.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.example.pattern.creational.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("8700391758",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);


        iphoneStocksObservable.setStockCount(20);
        iphoneStocksObservable.setStockCount(-20);

        iphoneStocksObservable.setStockCount(100);
    }
}
