package com.example.pattern.creational.Factory;

public class Square implements Shape{
    int s = 4;
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }

    @Override
    public void area() {
        int area = s*s;
        System.out.println("area of circle is : "+area);
    }
}
