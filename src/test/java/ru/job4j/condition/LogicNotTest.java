package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when2ThenIsEven() {
        int num = 2;
        boolean expected = true;
        boolean out = LogicNot.isEven(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNegativ2ThenFalse() {
        int num = -2;
        boolean expected = false;
        boolean out = LogicNot.isPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when3thenNotEven() {
        int num = 3;
        boolean expected = true;
        boolean out = LogicNot.notEven(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNegativ5ThenNotPositive() {
        int num = -5;
        boolean expected = true;
        boolean out = LogicNot.notPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenEven7ThenNotEvenAndPositive() {
        int num = 7;
        boolean expected = true;
        boolean out = LogicNot.notEvenAndPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void evenOrNotPositive() {
        int num = 6;
        boolean expected = true;
        boolean out = LogicNot.evenOrNotPositive(num);
        Assert.assertEquals(expected, out);
    }
}