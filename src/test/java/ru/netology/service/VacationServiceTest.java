package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/test_data.csv")

    public void testVacationService(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calcRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testNumberOne() {
//        VacationService service = new VacationService();
//
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expected = 3;
//
//        int actual = service.calcRest(income, expenses, threshold);
//
//        Assertions.assertEquals(expected, actual);
//
//    }
//    @Test
//    public void testNumberTwo() {
//        VacationService service = new VacationService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//        int actual = service.calcRest(income,expenses,threshold);
//
//        Assertions.assertEquals(expected, actual);
//
//    }
}
