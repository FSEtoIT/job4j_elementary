package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum;
        for (sum = 0; sum <= 10; sum++) {
            sum = sum + sum++;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum;
        int sumEven = 0;
        for (sum = 0; sum <= 10; sum++) {
            if ((sum % 2) == 0) {
                sumEven = sumEven + sum++;
            }
            }
        return sumEven;
    }
}
