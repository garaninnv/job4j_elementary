package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float expectedEuro = 2;
        float expectedDollar = 3;
        float outEuro = Converter.rubleToEuro(140);
        float outDollar = Converter.rubleToDollar(180);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 EURO. Test result : " + passedEuro);
        System.out.println("180 rubles are 3 USD. Test result : " + passedDollar);
    }
}
