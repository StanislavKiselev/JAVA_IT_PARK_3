package com.company;

public class WeidthHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        int result = 0;
        if (a.getWeigth() < b.getWeigth()) {
            result = a.getWeigth() - b.getWeigth();
        }
        if (a.getWeigth() == b.getWeigth()) {
            result = 0;
        }
        if (a.getWeigth() > b.getWeigth()) {
            result = a.getWeigth() - b.getWeigth();
        }
        return result;
    }
}