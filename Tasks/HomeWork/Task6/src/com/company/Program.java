package com.company;

public class Program {
    private String name;
    private double beginTime;
    private double endTime;

    public Program(String name, double beginTime, double endTime) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public double getBeginTime() {
        return beginTime;
    }

    public double getEndTime() {
        return endTime;
    }


}