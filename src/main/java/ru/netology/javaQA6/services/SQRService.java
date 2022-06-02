package ru.netology.javaQA6.services;

public class SQRService {
    public int calculateSQR(int from, int to, int limitLow, int limitUp) {
        int squares = 0;
        for (int i = from; i <= to; i++) {
            if (limitLow <= i * i && i * i <= limitUp) {
                System.out.println("Корень из: " + i * i + "\n" + "      равен: " + i);
                squares++;
            }
        }
        return squares;
    }
}
