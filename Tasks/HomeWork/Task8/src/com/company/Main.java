package com.company;

public class Main {

    public static void main(String[] args) {
        HumanComparator ageCompare = new AgeHumanComparator();
        HumanComparator heightCompare = new HeightHumanComparator();
        HumanComparator weigthCompare = new WeidthHumanComparator();
        HumanSorter bubbleSort = new BubbleHumanSorter();
        HumanSorter selectionSort = new SelectionHumanSorter();

        Human a = new Human("Витя", 195, 25, 120);
        Human b = new Human("Толя", 182, 40, 102);
        Human c = new Human("Кеша", 165, 32, 89);
        Human d = new Human("Вася", 175, 35, 92);
        Human e = new Human("Лёва", 192, 45, 95);
        Human f = new Human("Петя", 167, 55, 101);
        Human g = new Human("Катя", 177, 29, 94);

        Human humans[] = {a, b, c, d, e, f, g};

        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }

        System.out.println("Массив после пузарьковой сортировки по возрасту: ");
        bubbleSort.sort(ageCompare, humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }

        System.out.println("Массив после пузарьковой сортировки по росту: ");
        bubbleSort.sort(heightCompare, humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }

        System.out.println("Массив после пузарьковой сортировки по весу: ");
        bubbleSort.sort(weigthCompare, humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }

        System.out.println("Массив после сортировки выбором по возрасту: ");
        selectionSort.sort(ageCompare, humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }

        System.out.println("Массив после сортировки выбором по росту: ");
        selectionSort.sort(heightCompare, humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }

        System.out.println("Массив после сортировки выбором по весу: ");
        selectionSort.sort(weigthCompare, humans);
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ", возраст " + humans[i].getAge() + ", рост " + humans[i].getHeight() + ", вес " + humans[i].getWeigth());
        }
    }
}