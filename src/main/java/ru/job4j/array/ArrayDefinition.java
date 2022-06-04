package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] arrayShort = new short[10];
        System.out.println("Размер массива : " + arrayShort.length);
        String[] arrayString = new String[100500];
        System.out.println("Размер массива : " + arrayString.length);
        float[] arrayFloat = new float[40];
        System.out.println("Размер массива : " + arrayFloat.length);
    }
}
