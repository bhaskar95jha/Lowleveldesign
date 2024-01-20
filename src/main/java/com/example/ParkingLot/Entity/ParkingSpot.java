package com.example.ParkingLot.Entity;

public abstract class ParkingSpot {
    String spotId;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    abstract int spotPrice();
    void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
    }
    void removeVehicle(){
        this.vehicle = null;
        isEmpty = true;
    }

}
