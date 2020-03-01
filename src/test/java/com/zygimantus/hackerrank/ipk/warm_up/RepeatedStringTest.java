package com.zygimantus.hackerrank.ipk.warm_up;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {
    @Test
    public void shouldAnswerWithTrue() {
        String s = "aba";
        long n = 10;

        long result = RepeatedString.repeatedString(s, n);
        System.out.println(result);
        Assert.assertEquals(7, result);

        s = "a";
        n = 1000000000000L;

        result = RepeatedString.repeatedString(s, n);
        System.out.println(result);
        Assert.assertEquals(1000000000000L, result);
    }
}
