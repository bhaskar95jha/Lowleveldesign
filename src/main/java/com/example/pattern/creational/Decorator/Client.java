package com.example.pattern.creational.Decorator;

public class Client {
    public static void main(String[] args) {
        BasePizza farmhouse = new Farmhouse();
        System.out.println("Cost of Farmhouse Pizza is : "+farmhouse.cost());

        BasePizza farmHouseWithExtraCheese = new ExtraCheese(new Farmhouse());
        System.out.println("Cost of Farmhouse Pizza with Extra Cheese is : "+farmHouseWithExtraCheese.cost());

        BasePizza farmHouseWithExtraCheeseAndMushroom = new Mushroom(new ExtraCheese(new Farmhouse()));
        System.out.println("Cost of Farmhouse Pizza with Extra Cheese and Mushroom is : "+farmHouseWithExtraCheeseAndMushroom.cost());

    }
}
