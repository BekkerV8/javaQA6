package ru.netology.javaQA6.services;

public class SQRService {
    public int calculateSQR(int from, int to) {
        int upLimit = (int) Math.sqrt(to);
        int squares = 0;
        for (int i = 1; i <= upLimit; i++) {
            if (i * i >= from && i * i <= to) {
                squares++;
            }
        }
        return squares;
    }
}
