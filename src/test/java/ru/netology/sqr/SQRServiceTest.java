package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test1() {
        SQRService service = new SQRService();
        int actual = service.calculate(10, 30);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 400);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        SQRService service = new SQRService();
        int actual = service.calculate(1000, 2000);
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        SQRService service = new SQRService();
        int actual = service.calculate(10000, 20000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
