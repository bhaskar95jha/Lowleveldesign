package com.example.pattern.creational.BuilderMobile;

public class Client {

    public static void main(String[] args) {
        Director samsungMobileDirector = new Director(new SamsungMobileBuilder());
        Director appleMobileDirector = new Director(new AppleMobileBuilder());

        Mobile samsungMobile = samsungMobileDirector.createMobile();
        Mobile appleMobile = appleMobileDirector.createMobile();

        System.out.println(samsungMobile.toString());
        System.out.println(appleMobile.toString());
    }

}
