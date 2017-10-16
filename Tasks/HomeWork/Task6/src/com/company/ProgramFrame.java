package com.company;

import java.util.Scanner;

public class ProgramFrame {

    public static void tvOn (Singleton tv) {
        Program tehPereryv1 = new Program("Технический перерыв", 00.00, 02.00);
        Program igrayGarmon = new Program("Играй, гармонь любимая", 02.00, 04.00);
        Program smeshariki = new Program("Смешарики", 04.00, 06.00);
        Program slovoPastyrya = new Program("Слово Пастыря", 06.00, 08.00);
        Program novosti = new Program("Новости", 08.00, 10.00);
        Program millioner = new Program("Кто хочет стать миллионером?", 10.00, 12.00);
        Program poleChudes = new Program("Поле чудес", 12.00, 14.00);
        Program znatoki = new Program("Следствие ведут знатоки", 14.00, 16.00);
        Program moskva = new Program("Москва слезам не верит", 16.00, 18.00);
        Program pustGovoryat = new Program("Пусть говорят", 18.00, 20.00);
        Program matrix = new Program("Матрица", 20.00, 22.00);
        Program xMen = new Program("Люди Икс", 22.00, 00.00);

        Program pervyjArray[] = {tehPereryv1, igrayGarmon, smeshariki, slovoPastyrya, novosti, millioner, poleChudes, znatoki, moskva, pustGovoryat, matrix, xMen};
        Channel pervyj = new Channel(pervyjArray);


        Program tehPereryv2 = new Program("Технический перерыв", 00.00, 02.00);
        Program vesti = new Program("Вести", 02.00, 03.30);
        Program utroRossii = new Program("Утро России", 03.30, 04.50);
        Program sudba = new Program("Судьба человека с Борисом Корчевниковым", 04.50, 08.00);
        Program tayny = new Program("Тайны следствия", 08.00, 09.30);
        Program malahov = new Program("Андрей Малахов. Прямой эфир", 09.30, 11.50);
        Program chapman = new Program("Тайны Анны Чапман", 11.50, 13.30);
        Program vesti2 = new Program("Вести", 13.30, 15.50);
        Program nazhivka = new Program("Наживка", 15.50, 17.30);
        Program begushaya = new Program("Бегущая от любви", 17.30, 19.50);
        Program roditeli = new Program("Родители", 19.50, 21.30);
        Program fakery = new Program("Знакомство с Факерами", 21.30, 00.00);

        Program russiaArray[] = {tehPereryv2, vesti, utroRossii, sudba, tayny, malahov, chapman, vesti2, nazhivka, begushaya, roditeli, fakery};
        Channel russia = new Channel(russiaArray);

        Program tehPereryv3 = new Program("Технический перерыв", 00.00, 02.00);
        Program pole = new Program("Поле битвы", 02.00, 03.45);
        Program novostiS = new Program("Новости", 03.45, 05.50);
        Program football = new Program("Футбол. Сборная России - сборная детского сада №302", 05.50, 07.30);
        Program gimnastika = new Program("Спортивная гимнастика. Чемпионат 2017", 07.30, 10.10);
        Program match = new Program("Все на Матч!", 10.10, 12.20);
        Program novostiS2 = new Program("Новости", 12.20, 14.10);
        Program hockey = new Program("Хоккей. АК Барс - Металлург", 14.10, 16.20);
        Program marion = new Program("Марион Джонс. Потерять всё", 16.20, 18.15);
        Program bratya = new Program("Братья в изгнании", 18.15, 20.25);
        Program rokki = new Program("Настоящий Рокки", 20.25, 22.10);
        Program tna = new Program("Бой за кубок TNA 2017. Финал", 22.10, 00.00);

        Program sportArray[] = {tehPereryv3, pole, novostiS, football, gimnastika, match, novostiS2, hockey, marion, bratya, rokki, tna};
        Channel sport = new Channel(sportArray);


        Program tehPereryv4 = new Program("Технический перерыв", 00.00, 02.00);
        Program lesnik = new Program("Лесник", 02.00, 04.15);
        Program segodnya = new Program("Сегодня", 04.15, 06.00);
        Program vozvrashenie = new Program("Возвращение Мухтара", 06.00, 08.20);
        Program advokat = new Program("Адвокат", 08.20, 10.00);
        Program segodnya2 = new Program("Сегодня", 10.00, 12.10);
        Program mesto = new Program("Место встречи", 12.10, 14.00);
        Program proisshestviya = new Program("Чрезвычайные происшествия", 14.00, 16.10);
        Program ulicy = new Program("Улицы разбитых фонарей-28", 16.10, 18.00);
        Program nevskij = new Program("Невский-2", 18.00, 20.10);
        Program alien = new Program("Чужой", 20.10, 22.00);
        Program peradacha = new Program("Передача для взрослых", 22.00, 00.00);

        Program ntvArray[] = {tehPereryv4, lesnik, segodnya, vozvrashenie, advokat, segodnya2, mesto, proisshestviya, ulicy, nevskij, alien, peradacha};
        Channel ntv = new Channel(ntvArray);


        Program tehPereryv5 = new Program("Технический перерыв", 00.00, 02.00);
        Program deffchonki = new Program("Деффчонки", 02.00, 04.00);
        Program best = new Program("ТНТ Best", 04.00, 06.00);
        Program interny = new Program("Интерны", 06.00, 08.00);
        Program nasha = new Program("Наша Russia", 08.00, 10.00);
        Program fizruk = new Program("Физрук", 10.00, 12.00);
        Program zhenih = new Program("Жених", 12.00, 14.00);
        Program tancy = new Program("Танцы", 14.00, 16.00);
        Program woman = new Program("Comedy woman", 16.00, 18.00);
        Program club = new Program("Comedy Club", 18.00, 20.00);
        Program samyj = new Program("Самый лучший фильм-3", 20.00, 22.00);
        Program gorko = new Program("Горько-2", 22.00, 00.00);

        Program tntArray[] = {tehPereryv5, deffchonki, best, interny, nasha, fizruk, zhenih, tancy, woman, club, samyj, gorko};
        Channel tnt = new Channel(tntArray);

        Scanner scanner = new Scanner (System.in);
        int choice = scanner.nextInt();
        if (choice > 0 && choice < 7) {
            switch (choice) {
                case 1: {
                    pervyj.show(pervyj);
                }
                break;
                case 2: {
                    russia.show(russia);
                }
                break;
                case 3: {
                    sport.show(sport);
                }
                break;
                case 4: {
                    ntv.show(ntv);
                }
                break;
                case 5: {
                    tnt.show(tnt);
                }
                break;
                case 6: {
                    System.out.println("Я знаю ты вернешься!");
                    System.exit(0);
                }
            }
        } else {
            System.err.println("На пульте 6 кнопок!");
        }
    }
}