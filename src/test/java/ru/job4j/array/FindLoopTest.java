package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7ThenFalse() {
        int[] data = {5, 4, 0, 2};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

        @Test
        public void whenDiapasonHasNot8ThenMinus1() {
            int[] data = new int[]{5, 2, 10, 7, 2, 4};
            int el = 8;
            int start = 2;
            int finish = 4;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = -1;
            Assert.assertEquals(expected, result);
        }

    @Test
    public void whenDiapasonHasNot7Then3() {
        int[] data = new int[]{5, 2, 10, 7, 2, 4};
        int el = 7;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}