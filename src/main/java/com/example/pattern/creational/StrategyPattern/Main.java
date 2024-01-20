package com.example.pattern.creational.StrategyPattern;

import com.example.pattern.creational.StrategyPattern.strategy.DriveStrategyManager;
import com.example.pattern.creational.StrategyPattern.strategy.SportsDriveStrategy;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        vehicle = new GoodsVehicle();
        vehicle.drive();

        vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
