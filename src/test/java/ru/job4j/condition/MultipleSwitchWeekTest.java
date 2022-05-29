package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDayWednesday() {
        String in = "Понедельник";
        int out = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void numberOfDaySaturday() {
        String in = "Saturday";
        int out = MultipleSwitchWeek.numberOfDay(in);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }
}