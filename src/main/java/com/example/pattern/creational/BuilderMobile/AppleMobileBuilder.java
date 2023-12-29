package com.example.pattern.creational.BuilderMobile;

public class AppleMobileBuilder extends MobileBuilder{
    @Override
    public MobileBuilder companyName() {
        String name = "This Phone is from Apple Company and model is 14 PLUS.";
        this.companyName = name;
        return this;
    }
}
