package com.company;

public class Rectangle extends Square {
    protected double cut2;

    public Rectangle(double cut, double cut2) {
        super(cut);
        if (cut2 > 0) {
            this.cut2 = cut2;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
    }

    public Rectangle() {
    }

    public void setCut2(double cut2) {
        this.cut2 = cut2;
    }

    public double getCut2() {
        return cut2;
    }

    public double area(double cut, double cut2) {
        double result = 0;
        if (cut > 0 && cut2 > 0) {
            result = cut * cut2;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
        return result;
    }

    public double perimeter(double cut, double cut2) {
        double result = 0;
        if (cut > 0 && cut2 > 0) {
            result = (cut + cut2) * 2;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
        return result;
    }
}