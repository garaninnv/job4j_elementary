package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K2Then2p72() {
        double p = 7;
        double k = 2;
        double expected = 2.72;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K3Then1p68() {
        double p = 6;
        double k = 3;
        double expected = 1.68;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}