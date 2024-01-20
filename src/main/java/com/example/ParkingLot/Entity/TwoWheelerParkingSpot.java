package com.example.ParkingLot.Entity;

public class TwoWheelerParkingSpot extends ParkingSpot{

    @Override
    int spotPrice() {
        super.price = 10;
        return price;
    }
}
