package ru.job4j.max;

public class Reduce {
    private int[] arrayObject;

    public void to(int[] array) {
        arrayObject = array;
    }

    public void print() {
        for (int index = 0; index < arrayObject.length; index++) {
            System.out.println(arrayObject[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
