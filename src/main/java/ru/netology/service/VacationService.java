package ru.netology.service;

public class VacationService {
    public int calcRest(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // кол-во денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { //отдых
                count++; //увеличивается счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + (income - expenses);
            }
        }
        return count;
    }
}
