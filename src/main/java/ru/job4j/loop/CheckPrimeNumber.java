package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean rsl = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                rsl = false;
                break;
            }
        }
        if (number == 1) {
            rsl = false;
        }
        return rsl;
    }
}