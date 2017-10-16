package com.company;

public class Oval extends Round {
    protected double radius2;

    public Oval(double radius, double radius2) {
        super(radius);
        if (radius2 > 0) {
            this.radius2 = radius2;
        } else {
            System.err.println("Радиус не может быть равен 0 или отрицательному числу");
        }
    }

    public Oval() {
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    public double area(double radius, double radius2) {
        double result = 0;
        if (radius > 0 && radius2 > 0) {
            result = 3.14 * radius * radius2;
        } else {
            System.err.println("Радиус не может быть равен 0 или отрицательному числу");
        }
        return result;
    }

    public double perimeter(double radius, double radius2) {
        double result = 0;
        if (radius > 0 && radius2 > 0) {
            result = 2 * 3.14 * Math.sqrt((radius * radius + radius2 * radius2) / 2);
        } else {
            System.err.println("Радиус не может быть равен 0 или отрицательному числу");
        }
        return result;
    }
}