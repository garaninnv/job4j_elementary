package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] arrayShort = new short[10];
        System.out.println("Размер массива : " + arrayShort.length);
        String[] arrayString = new String[100500];
        System.out.println("Размер массива : " + arrayString.length);
        float[] arrayFloat = new float[40];
        System.out.println("Размер массива : " + arrayFloat.length);
        String[] names = new String[4];
        names[0] = "Garanin Nikolay";
        names[1] = "Garanina Oksana";
        names[2] = "Garanin Semen";
        names[3] = "Garanina Anastasiya";
        for (String element : names) {
            System.out.println(element);
        }
    }
}
