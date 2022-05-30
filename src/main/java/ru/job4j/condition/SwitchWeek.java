package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
               name = "Понедельник";
            case 2 :
               name = "Вторник";
            case 3 :
                name = "Среда";
            case 4 :
                name = "Четверг";
            case 5 :
                 name = "Пятница";
            case 6 :
                name = "Суббота";
            case 7:
                 name = "Воскресенье";
            default:
                name = "Ошибка";
        }
        return name;

    }
}
