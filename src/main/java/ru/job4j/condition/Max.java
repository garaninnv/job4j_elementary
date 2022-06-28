package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int number) {
        int result = max(left, right);
        result = max(result, number);
        return result;
    }

    public static int max(int left, int right, int numberA, int numberB) {
        int result = max(left, right);
        result = max(result, numberA);
        return max(result, numberB);
    }
}
