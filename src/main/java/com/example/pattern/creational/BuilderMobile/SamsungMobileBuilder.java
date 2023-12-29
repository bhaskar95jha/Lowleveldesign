package com.example.pattern.creational.BuilderMobile;

public class SamsungMobileBuilder extends MobileBuilder{
    @Override
    public MobileBuilder companyName() {
        String name = "This Phone is from samsung Company and model name is J7";
        this.companyName = name;
        return this;
    }
}
