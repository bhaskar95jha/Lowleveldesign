package com.example.pattern.creational.StrategyPattern;

import com.example.pattern.creational.StrategyPattern.strategy.DriveStrategyManager;

public class Vehicle {
    DriveStrategyManager dsm;
    Vehicle(DriveStrategyManager dsm){
        this.dsm = dsm;
    }

    void drive(){
        dsm.drive();
    }
}
