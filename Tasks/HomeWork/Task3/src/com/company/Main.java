package com.company;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];
        System.out.print("\n");
        System.out.print("Введите цифры: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("\n");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма четных чисел: " + sum);
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма нечетных чисел: " + sum);
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма чисел стоящих на четной позиции: " + sum);
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма чисел стоящих на нечетной позиции: " + sum);
        sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                sum = sum + 1;
            }
        }
        System.out.println("Количество локальных максимумов: " + sum);
        sum = 1;
        int itog = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                sum = sum + 1;
                if (itog < sum) {
                    itog = sum;
                }
            }
            else {
                sum = 1;
            }
        }
        System.out.println("Количество чисел максимально длинной последовательности: " + itog);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (array[i+1] == 0) {
                }
                else{
                    array[i] = -array[i+1];
                }
            }
        }
        System.out.print("Замена нулей в массиве: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}