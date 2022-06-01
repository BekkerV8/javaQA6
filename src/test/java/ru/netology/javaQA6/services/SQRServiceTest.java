package ru.netology.javaQA6.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaQA6.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10,90,6",
            "9,500,20"
    })
    public void shouldCalcExact(int from, int to, int expected) {
        SQRService service = new SQRService();
        //int expected = 6;
        int actual = service.calculateSQR(from, to);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
   // public void shouldCalcInexact() {
     //   SQRService service = new SQRService();
       // int expected = 20;
       // int actual = service.calculateSQR(9, 500);

       // Assertions.assertEquals(expected, actual);
   // }
}
