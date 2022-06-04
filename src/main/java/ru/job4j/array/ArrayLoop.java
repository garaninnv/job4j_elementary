package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayIndex = new int[5];
        for (int i = 0; i < arrayIndex.length; i++) {
            arrayIndex[i] = i * 2 + 3;
        }
        for (int element : arrayIndex) {
            System.out.println(element);
        }
    }
}
