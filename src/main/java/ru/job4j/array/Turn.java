package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
           int  buf = array[index];
           array[index] = array[array.length - 1 - index];
           array[array.length - 1 - index] = buf;
        }
        return array;
    }
}
