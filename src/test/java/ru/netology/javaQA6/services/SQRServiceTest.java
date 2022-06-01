package ru.netology.javaQA6.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaQA6.services.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calculateSQR(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();
        int expected = 20;
        int actual = service.calculateSQR(9, 500);

        Assertions.assertEquals(expected, actual);
    }
}
