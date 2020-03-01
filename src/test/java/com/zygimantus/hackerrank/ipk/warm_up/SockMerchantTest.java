package com.zygimantus.hackerrank.ipk.warm_up;

import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {
    @Test
    public void shouldAnswerWithTrue() {
        int n = 7;
        int[] ar = new int[] { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };

        int result = SockMerchant.sockMerchant(n, ar);
        System.out.println(result);
        Assert.assertEquals(4, result);
    }
}
