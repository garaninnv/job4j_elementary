package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusDivided(double first, double second) {
     return minus(first, second) + divided(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + minusDivided(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы сумм и произведения: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета сумма разности и деления: " + minusDivided(10, 20));
        System.out.println("Результат расчета равен: " + sumAll(10, 20));
    }
    }
