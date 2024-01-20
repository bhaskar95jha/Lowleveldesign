package com.example.pattern.creational.StrategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategyManager{
    @Override
    public void drive() {
        System.out.println("Implements Special Drive Strategy");
    }
}
