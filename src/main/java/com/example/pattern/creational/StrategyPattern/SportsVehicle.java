package com.example.pattern.creational.StrategyPattern;

import com.example.pattern.creational.StrategyPattern.strategy.DriveStrategyManager;
import com.example.pattern.creational.StrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
