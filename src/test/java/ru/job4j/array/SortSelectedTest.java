package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public  void whenSortArrayOf9elements() {
        int[] data = new int[] {8, 9, 7, 6, 1, 4, 3, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public  void whenSortArrayOf3elements() {
        int[] data = new int[] {8, 9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5NewElements() {
        int[] data = new int[] {3, 4, 0, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}