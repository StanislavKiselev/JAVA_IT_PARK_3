package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Round round = new Round();
        Oval oval = new Oval();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину отрезка квадрата:");
        double cut = scanner.nextDouble();
        System.out.println("Введите длину второго отрезка прямоугольника:");
        double cut2 = scanner.nextDouble();
        System.out.println("Введите длину третьего отрезка треугольника:");
        double cut3 = scanner.nextDouble();
        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();
        System.out.println("Введите второй радиус овала:");
        double radius2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Расчет произведен:");
        System.out.println("Площадь квадрата равна: " + square.area(cut) + ", " + "периметр квадрата равен: " + square.perimeter(cut));
        System.out.println("Площадь прямоугольника равна: " + rectangle.area(cut, cut2) + ", " + "периметр прямоугольника равен: " + rectangle.perimeter(cut, cut2));
        System.out.print("Площадь треугольника равна: ");
        System.out.printf("%.1f",+ triangle.area(cut, cut2, cut3));
        System.out.println(", " + "периметр треугольника равен: " + triangle.perimeter(cut, cut2, cut3));
        System.out.print("Площадь круга равна: " + round.area(radius) + ", " + "периметр круга равен: ");
        System.out.printf("%.1f",+ round.perimeter(radius));
        System.out.println("");
        System.out.print("Площадь овала равна: " + oval.area(radius, radius2) + ", " + "периметр овала равен: ");
        System.out.printf("%.1f",+ oval.perimeter(radius, radius2));
        System.out.println("\n");
        System.out.println("Перезапуск программы - 1, выход из программы - 0:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            main(null);
        }
        if (choice == 0) {
            System.exit(0);
        } else {
            System.err.println("По-русски же написано какие цифры вводить!");
        }
    }
}