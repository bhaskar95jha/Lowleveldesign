package com.example.ParkingLot.Entity;

public class Driver {
    public static void main(String[] args) {
        ParkingSpot twoWheelerspot = new TwoWheelerParkingSpot();
        System.out.println("Two wheeler price is : "+twoWheelerspot.spotPrice());

        ParkingSpot fourWheelerSpot = new FourWheelerParkingSpot();
        System.out.println("Four Wheeler Spot price is : "+fourWheelerSpot.spotPrice());
    }
}
