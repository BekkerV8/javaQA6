import ru.netology.javaQA6.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int from = 200;
        int to = 300;

        SQRService service = new SQRService();
        System.out.println("Количество квадратов: " + service.calculateSQR(from, to));
    }
}
