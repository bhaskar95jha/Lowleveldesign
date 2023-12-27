package com.example.pattern.creational;

import java.util.UUID;

public class Singleton {

    private static Singleton obj = null;
    private String value;

    //use private constructor to force use of getInstance to create singleton object
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(obj == null){
            obj = new Singleton(value);
        }
        return obj;
    }

    public static void main(String args[]){
        String value = UUID.randomUUID().toString().substring(0,16);
        System.out.println(value);
        Singleton s1 = getInstance(value);
        System.out.println(s1);
        Singleton s2 = getInstance(value);
        System.out.println(s2);
    }

}
