package ru.netology.javaqa.dz_5_batchesAndLoops.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                count++;
            }
        }
        return count;
    }
}
