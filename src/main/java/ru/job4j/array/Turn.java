package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int buf;
        int len = array.length;
        for (int index = 0; index <= (len - 1) / 2; index++) {
           buf = array[index];
           array[index] = array[len - 1 - index];
           array[len - 1 - index] = buf;
        }
        return array;
    }
}
