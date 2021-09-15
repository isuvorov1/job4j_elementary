package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter2.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToFifteenThenFiftySix() {
        int start = 2;
        int finish = 15;
        int result = Counter2.sumByEven(start, finish);
        int expected = 56;
        Assert.assertEquals(expected, result);
    }
}
