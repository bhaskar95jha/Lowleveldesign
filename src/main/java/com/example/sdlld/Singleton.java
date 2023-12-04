package com.example.sdlld;

public class Singleton {
    private static Singleton obj = null;
    // private constructor to force use of getInstance() to create Singleton object
    private Singleton() {}
    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }

    public static void main(String args[]){
        Singleton s1 = getInstance();
        System.out.println(s1);
        Singleton s2 = getInstance();
        System.out.println(s2);
    }
}
