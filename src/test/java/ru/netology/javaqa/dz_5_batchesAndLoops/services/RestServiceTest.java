package ru.netology.javaqa.dz_5_batchesAndLoops.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.dz_5_batchesAndLoops.services.RestServiceTest;

public class RestServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "2,10000,3000,20000",
//            "3,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/calculation.csv")
    public void CalculationMonthTwo(int expected, int income, int expenses, int threshold) {

        RestService service = new RestService();

//        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void CalculationMonthTwo() {
//
//        RestService service = new RestService();
//
//        int expected = 2;
//        int actual = service.calculate(10_000, 3_000, 20_000);
//        Assertions.assertEquals(expected, actual);
//    }


//    @Test
//    public void CalculationMonthThree() {
//
//        RestService service = new RestService();
//
//        int expected = 3;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        Assertions.assertEquals(expected, actual);
//    }
}
