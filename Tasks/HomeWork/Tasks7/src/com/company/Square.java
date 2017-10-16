package com.company;

public class Square {
    protected double cut;

    public Square(double cut) {
        if (cut > 0) {
            this.cut = cut;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
    }

    public Square() {
    }

    public void setCut(double cut) {
        this.cut = cut;
    }

    public double getCut() {
        return cut;
    }

    public double area(double cut) {
        double result = 0;
        if (cut > 0) {
            result = cut * cut;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
        return result;
    }

    public double perimeter(double cut) {
        double result = 0;
        if (cut > 0) {
            result = cut * 4;
        } else {
            System.err.println("Длина не может быть равна 0 или отрицательному числу");
        }
        return result;
    }
}