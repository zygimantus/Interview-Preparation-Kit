package com.zygimantus.hackerrank.ipk.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArraysLeftRotationTest {
    @Test
    public void shouldAnswerWithTrue() {
        int[] a = new int[] {1,2,3,4,5};
        int d = 4;

        int[] result = ArraysLeftRotation.rotLeft(a, d);
        System.out.println(result);
        Assert.assertArrayEquals(new int[] {5,1,2,3,4}, result);
    }
}
