package com.company;

public class Round {
    protected double radius;

    public Round(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.err.println("Радиус не может быть равен 0 или отрицательному числу");
        }
    }

    public Round() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(double radius) {
        double result = 0;
        if (radius > 0) {
            result = 3.14 * radius * radius;
        } else {
            System.err.println("Радиус не может быть равен 0 или отрицательному числу");
        }
        return result;
    }

    public double perimeter(double radius) {
        double result = 0;
        if (radius > 0) {
            result = 2 * 3.14 * radius;
        } else {
            System.err.println("Радиус не может быть равен 0 или отрицательному числу");
        }
        return result;
    }
}