package com.company;

public class TV {
    private Channel channels[];

    public static void showMenu() {
        System.out.println("Выберите канал:");
        System.out.println("1.Первый канал");
        System.out.println("2.Россия");
        System.out.println("3.Спорт");
        System.out.println("4.НТВ");
        System.out.println("5.ТНТ");
        System.out.println("6.Выключить телевизор");
    }

    public static void remote (Singleton tv) {
        ProgramFrame.tvOn(tv);
    }
}