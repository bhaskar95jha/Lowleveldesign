package com.example.pattern.creational.Factory;

public class Circle implements Shape{
    int radius = 7;
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }

    @Override
    public void area() {
        float area = 22/7*7*7;
        System.out.println("area of circle is : "+area);
    }
}
