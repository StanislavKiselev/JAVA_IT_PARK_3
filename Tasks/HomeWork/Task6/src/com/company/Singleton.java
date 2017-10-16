package com.company;

public class Singleton {
    private final static Singleton tv;

    private Singleton() {
        System.out.println("Телевизор включен");
    }

    static {
        tv = new Singleton();
    }

    public static Singleton getTv() {
        return tv;
    }
}