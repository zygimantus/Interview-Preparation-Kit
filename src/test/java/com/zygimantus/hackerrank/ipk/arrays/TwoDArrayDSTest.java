package com.zygimantus.hackerrank.ipk.arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoDArrayDSTest {
    @Test
    public void shouldAnswerWithTrue() {
        int[][] arr = new int[][] { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 },
                { 0, 0, 2, 4, 4, 0 }, { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

        int result = TwoDArrayDS.hourglassSum(arr);
        System.out.println(result);
        Assert.assertEquals(19, result);
    }
}
