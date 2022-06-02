package ru.netology.javaQA6.services;

public class SQRService {
    public int calculateSQR(int limitLow, int limitUp) {
        int squares = 0;
        for (int i = 10; i <= 99; i++) {
            if (limitLow <= i * i && i * i <= limitUp) {
                squares++;
            }
        }
        return squares;
    }
}
