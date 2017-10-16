package com.company;

import java.time.LocalTime;

public class Channel {
    private Program programs[];

    public Channel(Program programs[]) {
        this.programs = programs;
    }

    public Channel() {
    }

    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }

    public Program[] getPrograms() {
        return programs;
    }

    public void show(Channel channel) {
        channel.showPrograms();
    }

    public void showPrograms() {
        LocalTime thisTime = LocalTime.now();
        double a = thisTime.getHour() + thisTime.getMinute() * 0.01;
        for (int i = 0; i < programs.length; i++) {
            if (programs[i].getBeginTime() <= a && programs[i].getEndTime() > a) {
                System.out.println("Сейчас в эфире: " + programs[i].getName());
                double b = programs[i].getEndTime() - a;
                System.out.print("Следующая передача: " + programs[i + 1].getName() + " начнется в ");
                System.out.printf("%.2f", programs[i + 1].getBeginTime());
                System.out.println("");
            }
        }
    }
}