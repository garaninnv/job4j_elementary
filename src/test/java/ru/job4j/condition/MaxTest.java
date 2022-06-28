package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int out = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int out = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int out = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenMax3To3To5Then5() {
        int left = 3;
        int right = 3;
        int number = 5;
        int out = Max.max(left, right, number);
        int expected = 5;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenMax3To3To2To7Then7() {
        int left = 3;
        int right = 3;
        int numberA = 2;
        int numberB = 7;
        int out = Max.max(left, right, numberA, numberB);
        int expected = 7;
        Assert.assertEquals(out, expected);
    }
}