package com.example.pattern.creational.BuilderMobile;

public abstract class MobileBuilder {
    String cameraPixel;
    String screenType;
    String ramStorage;
    String osType;
    String companyName;

    public MobileBuilder cameraPixel(String cameraPixel) {
        this.cameraPixel = cameraPixel;
        return this;
    }

    public MobileBuilder screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    public MobileBuilder RAMStorage(String ramStorage) {
        this.ramStorage = ramStorage;
        return this;
    }

    public MobileBuilder osType(String osType) {
        this.osType = osType;
        return this;
    }

    public abstract MobileBuilder companyName();

    public Mobile build(){
        return new Mobile(this);
    }
}
