package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
               + multiply(first, second);
    }

    public static double decAndDiv(double first, double second) {
        return dec(first, second)
                + div(first, second);
    }

    public static double sumAndMultiplyAndDecAndDiv(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                    + dec(first, second)
                        + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета СУМА+УМНОЖЕНИЕ равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета РАЗНИЦА+ДЕЛЕНИЕ равен: " + decAndDiv(10, 20));
        System.out.println("Результат расчета СУМА+УМНОЖЕНИЕ+РАЗНИЦА+ДЕЛЕНИЕ равен: " + sumAndMultiplyAndDecAndDiv(10, 20));
    }
}
