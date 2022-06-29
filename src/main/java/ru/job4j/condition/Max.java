package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int number) {
        return max(max(left, right), number);
    }

    public static int max(int left, int right, int numberA, int numberB) {
        return max(max(max(left, right), numberA), numberB);
    }
}
