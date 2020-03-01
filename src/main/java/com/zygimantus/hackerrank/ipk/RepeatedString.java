package com.zygimantus.hackerrank.ipk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long result = 0;

        char[] array = s.toCharArray();
        for (char c : array) {
            if (c == 'a')
                result++;            
        }
        long number = n / array.length;
        result *= number;

        for (int i = 0; i < n % array.length; i++) {
            if (array[i] == 'a')
                result++;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
