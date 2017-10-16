package com.company;

public class AgeHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        int result = 0;
        if (a.getAge() < b.getAge()) {
            result = a.getAge() - b.getAge();
        }
        if (a.getAge() == b.getAge()) {
            result = 0;
        }
        if (a.getAge() > b.getAge()) {
            result = a.getAge() - b.getAge();
        }
        return result;
    }
}