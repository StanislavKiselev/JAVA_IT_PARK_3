package com.company;

public class Main {

    public static int parse(char digits[]) {
        int result = 0;
        for(int i = 0; i < digits.length; i++){
            int position = digits.length - 1 - i;
            int a = 1;
            for(int j = 0;j < position;j++){
                a = a * 10;
            }
            result = result + (digits[i] - 48) * a;
        }
        return result;
    }

    public static void main(String args[]) {
        char number[] = {'3', '2', '4', '1'};
        int numberAsInt = parse(number);
        System.out.println(numberAsInt); // 3241 должно быть на экране
    }
}