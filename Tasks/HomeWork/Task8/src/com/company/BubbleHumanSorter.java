package com.company;

public class BubbleHumanSorter implements HumanSorter {
    @Override
    public void sort(HumanComparator comparator, Human humans[]) {
        Human temp;
        for (int i = 0; i < humans.length; i++){
            for (int j = 1; j < humans.length - i; j++){
                if (comparator.compare(humans[j - 1], humans[j]) > 0) {
                    temp = humans[j - 1];
                    humans[j - 1] = humans[j];
                    humans[j] = temp;
                }
            }
        }
    }
}