package com.example.pattern.creational.BuilderMobile;

public class Mobile {
    String cameraPixel;
    String screenType;
    String ramStorage;
    String osType;
    String companyName;

    public Mobile(MobileBuilder mobileBuilder){
        this.cameraPixel = mobileBuilder.cameraPixel;
        this.screenType = mobileBuilder.screenType;
        this.ramStorage = mobileBuilder.ramStorage;
        this.osType = mobileBuilder.osType;
        this.companyName = mobileBuilder.companyName;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "cameraPixel='" + cameraPixel + '\'' +
                ", screenType='" + screenType + '\'' +
                ", ramStorage='" + ramStorage + '\'' +
                ", osType='" + osType + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

}
