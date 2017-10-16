package com.company;

public class Main {

    public static void main(String[] args) throws IOException {
        String document[] = new String[3];
        -        int count = 0;
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {
            -            System.out.println("МЕНЮ:");
            -            System.out.println("1. Показать документ");
            -            System.out.println("2. Вставить строку в начало");
            -            System.out.println("3. Вставить строку в конец");
            -            System.out.println("4. Удалить строку"); // спросить, какую строку удалить - сделать сдвиг
            -            System.out.println("5. Заменить строку");
            -            System.out.println("6. Очистить строку");
            -            System.out.println("7. Выход");
            +            Menu.showMenu();
            +
            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    -                    for (int i = 0; i < document.length; i++) {
                        -                        // тернарный условный оператор e ? a : b
                                -                        String lineToOut = document[i] == null ? "_______" : document[i];
                        -                        System.out.println(i + ": " + lineToOut);
                        -                    }
                    +                    DocumentUtil.showDocument(document);
                }
                break;
                case 2: {
                    -                    if (count == document.length) {
                        +                    if (DocumentUtil.count == document.length) {
                            System.err.println("Нет места");
                            break;
                        }
                        System.out.println("Введите строку: ");
                        String newLine = scanner.next();
                        -                    for (int i = count; i > 0; i--) {
                            -                        document[i] = document[i - 1];
                            -                    }
                        -                    document[0] = newLine;
                        -                    count++;
                        +                    DocumentUtil.addLineToBegin(document, newLine);
                    }
                    break;
                    case 3: {
                        -                    if (count == document.length) {
                            +                    if (DocumentUtil.count == document.length) {
                                System.err.println("Нет места");
                                break;
                            }
                            System.out.println("Введите строку: ");
                            String newLine = scanner.next();
                            -                    document[count] = newLine;
                            -                    count++;
                            +                    DocumentUtil.addLineToEnd(document, newLine);
                        }
                        break;
                        case 7:
