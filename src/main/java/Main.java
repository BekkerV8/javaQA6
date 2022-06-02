import ru.netology.javaQA6.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int from = 10;
        int to = 99;
        int limitLow = 200;
        int limitUp = 300;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов: " + service.calculateSQR(from, to, limitLow, limitUp));
    }
}
