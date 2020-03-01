package com.zygimantus.hackerrank.ipk.warm_up;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnCloudsTest {
    @Test
    public void shouldAnswerWithTrue() {
        int[] c = new int[] { 0, 0, 1, 0, 0, 1, 0 };

        int result = JumpingOnClouds.jumpingOnClouds(c);
        System.out.println(result);
        Assert.assertEquals(4, result);

        c = new int[] { 0, 0, 0, 1, 0, 0 };

        result = JumpingOnClouds.jumpingOnClouds(c);
        System.out.println(result);
        Assert.assertEquals(3, result);
    }
}
