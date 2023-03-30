package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        int myRest = service.calcRest(10000, 3000, 20000);
        System.out.println("Количество месяцев отдыха в году: " + myRest);


    }
}