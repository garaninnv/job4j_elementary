package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayMonday() {
        int in = 1;
        String expected = new String("Понедельник");
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected.equals(out), true);
    }

    @Test
    public void nameOfDayWednesday() {
        int in = 3;
        String expected = new String("Среда");
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected.equals(out), true);
    }

    @Test
    public void nameOfDaySaturday() {
        int in = 6;
        String expected = new String("Суббота");
        String out = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected.equals(out), true);
    }
}