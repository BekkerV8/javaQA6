import ru.netology.javaQA6.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int limitLow = 95;
        int limitUp = 600;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов: " + service.calculateSQR(limitLow, limitUp));
    }
}
