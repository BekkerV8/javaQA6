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
        int expected = 17;
        int actual = service.calculateSQR(0, 300);

        Assertions.assertEquals(expected, actual);
    }
}
