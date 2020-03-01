package com.zygimantus.hackerrank.ipk.warm_up;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {
    @Test
    public void shouldAnswerWithTrue() {
        int n = 8;
        String s = "UDDDUDUU";

        int result = CountingValleys.countingValleys(n, s);
        System.out.println(result);
        Assert.assertEquals(1, result);
    }
}
