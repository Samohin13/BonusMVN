package ru.netology.javaqa;

import ru.netology.javaqa.BonusService;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        System.out.println("1." + expected + " == ? == " + actual);


        // подготавливаем данные:
        amount = 1_000_000;
        registered = true;
        expected = 500;

        // вызываем целевой метод:
        actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        System.out.println("2." + expected + " == ? == " + actual);


    }

}

