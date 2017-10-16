package com.company;

public class Triangle extends Rectangle {
    protected double cut3;

    public Triangle(double cut, double cut2, double cut3) {
        super(cut, cut2);
        if (cut3 > 0) {
            this.cut3 = cut3;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
    }

    public Triangle() {
    }

    public double getCut3() {
        return cut3;
    }

    public void setCut3(double cut3) {
        this.cut3 = cut3;
    }

    public double area(double cut, double cut2, double cut3) {
        double result = 0;
        if (cut > 0 && cut2 > 0 && cut3 > 0) {
            double p = (cut + cut2 + cut3) / 2;
            result = Math.sqrt(p * (p - cut) * (p - cut2) * (p - cut3));
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
        return result;
    }

    public double perimeter(double cut, double cut2, double cut3) {
        double result = 0;
        if (cut > 0 && cut2 > 0 && cut3 > 0) {
            result = cut + cut2 + cut3;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
        return result;
    }
}