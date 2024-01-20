package com.example.pattern.creational.StrategyPattern.strategy;

public class NormalStrategy implements DriveStrategyManager{
    @Override
    public void drive() {
        System.out.println("Implemented Normal Strategy");
    }
}
