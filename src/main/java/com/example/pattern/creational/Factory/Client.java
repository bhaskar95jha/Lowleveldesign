package com.example.pattern.creational.Factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        circle.area();

        Shape rectangular = shapeFactory.getShape("rectangle");
        rectangular.draw();
        rectangular.area();

        Shape square = shapeFactory.getShape("square");
        square.draw();
        square.area();
    }
}
