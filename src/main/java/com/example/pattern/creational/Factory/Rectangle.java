package com.example.pattern.creational.Factory;

public class Rectangle implements Shape{
    int l = 4;
    int b = 3;
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }

    @Override
    public void area() {
        int area = l*b;
        System.out.println("area of circle is : "+area);
    }
}
