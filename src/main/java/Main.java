import ru.netology.javaQA6.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int from = 10;
        int to = 99;
        int limitLow = 9;
        int limitUp = 400;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов: " + service.calculateSQR(from, to, limitLow, limitUp));
    }
}
