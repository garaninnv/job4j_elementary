package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = p1.distance(p2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when01to20then2p23() {
        double expected = 2.23;
        Point p1 = new Point(0, 1);
        Point p2 = new Point(2, 0);
        double out = p1.distance(p2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when00to21then2p23() {
        double expected = 2.23;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 1);
        double out = p1.distance(p2);
        Assert.assertEquals(out, expected, 0.01);
    }
}