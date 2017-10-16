package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int x1 = number / 5000;
        number = number - x1*5000;
        int x2 = number / 1000;
        number = number - x2*1000;
        int x3 = number / 500;
        number = number - x3*500;
        int x4 = number / 100;
        number = number - x4*100;
        int x5 = number / 50;
        number = number - x5*50;
        int x6 = number / 10;
        number = number - x6*10;
        int x7 = number / 5;
        number = number - x7*5;
        int x8 = number / 2;
        number = number - x8*2;
        int x9 = number;

        System.out.println("Вы получите купюры следующего номинала:");
        System.out.println("5000р. - " + x1 + " шт.");
        System.out.println("1000р. - " + x2 + " шт.");
        System.out.println("500р. - " + x3 + " шт.");
        System.out.println("100р. - " + x4 + " шт.");
        System.out.println("50р. - " + x5 + " шт.");
        System.out.println("10р. - " + x6 + " шт.");
        System.out.println("5р. - " + x7 + " шт.");
        System.out.println("2р. - " + x8 + " шт.");
        System.out.println("1р. - " + x9 + " шт.");
    }
}