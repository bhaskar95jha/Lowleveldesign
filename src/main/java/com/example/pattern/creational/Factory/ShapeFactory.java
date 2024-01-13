package com.example.pattern.creational.Factory;

public class ShapeFactory {
    Shape getShape(String input){

        input = input.toLowerCase();

        switch (input){

            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }

    }


}
