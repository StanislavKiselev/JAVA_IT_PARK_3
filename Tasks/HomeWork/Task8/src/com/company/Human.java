package com.company;

public class Human {
    private String name;
    private int height;
    private int age;
    private int weigth;

    public Human(String name, int height, int age, int weigth) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}