package com.example.pattern.creational.BuilderMobile;

public class Director {
    private MobileBuilder mobileBuilder;

    public Director(MobileBuilder mobileBuilder){
        this.mobileBuilder = mobileBuilder;
    }

    public Mobile createMobile(){
        if(mobileBuilder instanceof SamsungMobileBuilder){
            return createSamsungMobileBuilder();
        }else if(mobileBuilder instanceof AppleMobileBuilder){
            return createAppleMobileBuilder();
        }
        return null;
    }

    private Mobile createAppleMobileBuilder() {
        return mobileBuilder.cameraPixel("12 MP High Quality").osType("MAC OS").RAMStorage("16 GB").screenType("LED").companyName().build();
    }

    private Mobile createSamsungMobileBuilder() {
        return mobileBuilder.cameraPixel("48 MP ").osType("Android").RAMStorage("16 GB").screenType("LCD").companyName().build();
    }


}
