package com.company;

public class HeightHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        int result = 0;
        if (a.getHeight() < b.getHeight()) {
            result = a.getHeight() - b.getHeight();
        }
        if (a.getHeight() == b.getHeight()) {
            result = 0;
        }
        if (a.getHeight() > b.getHeight()) {
            result = a.getHeight() - b.getHeight();
        }
        return result;
    }
}