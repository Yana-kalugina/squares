package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int total = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= max) {
                    total++;
                }
            }
        }
        return total;
    }
}
