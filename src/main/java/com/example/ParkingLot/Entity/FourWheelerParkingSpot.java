package com.example.ParkingLot.Entity;

public class FourWheelerParkingSpot extends ParkingSpot{
    @Override
    int spotPrice() {
        super.price = 20;
        return price;
    }
}
