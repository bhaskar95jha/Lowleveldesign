package com.example.pattern.creational.StrategyPattern;

import com.example.pattern.creational.StrategyPattern.strategy.DriveStrategyManager;
import com.example.pattern.creational.StrategyPattern.strategy.NormalStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalStrategy());
    }
}
