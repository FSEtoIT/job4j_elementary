package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) { // поменял на float, чтобы учитывать 4 знака после занятой
        // Assuming the conversion rate is 1 Euro = 90 Rubles
        return value / 90;
    }

    public static float rubleToDollar(float value) {  // поменял на float, чтобы учитывать 4 знака после занятой
        // Assuming the conversion rate is 1 Dollar = 75 Rubles
        return value / 75;
    }
}