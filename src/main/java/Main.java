import ru.netology.javaQA6.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int limitLow = -225;
        int limitUp = -10;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов: " + service.calculateSQR(limitLow, limitUp));
    }
}
