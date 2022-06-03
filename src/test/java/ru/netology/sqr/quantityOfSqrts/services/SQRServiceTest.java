package ru.netology.sqr.quantityOfSqrts.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test1.csv")
    public void shouldFindSomeRoots(int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrts(lowerBound, upperBound);
        // System.out.println(service.sqrts(lowerBound, upperBound));
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test2.csv")
    public void shouldFindNoRoots(int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrts(lowerBound, upperBound);
        // System.out.println(service.sqrts(lowerBound, upperBound));
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test3.csv")
    public void incorrectInputBounds(int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        if (lowerBound < upperBound) {
            int actual = service.sqrts(lowerBound, upperBound);
            Assertions.assertEquals(expected, actual);
        } else {
            System.out.println("Некорректные тестовые данные. Нижняя граница " +  lowerBound + " больше, чем верхняя " + upperBound);
        }
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test4.csv")
    public void incorrectBoundLimit(int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        if ((lowerBound <= 100) || (upperBound >= 9801)) {
            System.out.println("Некорректные тестовые данные. Не учтен лимит граничных значений квадратов 10 и 99.");
        } else {
            int actual = service.sqrts(lowerBound, upperBound);
            Assertions.assertEquals(expected, actual);
        }
    }
}
