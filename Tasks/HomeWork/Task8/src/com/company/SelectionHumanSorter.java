package com.company;

public class SelectionHumanSorter implements HumanSorter {
    @Override
    public void sort(HumanComparator comparator, Human[] humans) {
        Human min;
        Human temp;
        for (int i = 0; i < humans.length; i++) {
            min = humans[i];
            int min_i = i;
            for (int j = i + 1; j < humans.length; j++) {
                if (comparator.compare(humans[j], humans[min_i]) < 0) {
                    min = humans[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                temp = humans[i];
                humans[i] = humans[min_i];
                humans[min_i] = temp;
            }
        }
    }
}