package com.zygimantus.hackerrank.ipk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int result = 0;
        int level = 0;
        char[] steps = s.toCharArray();
        for (char step : steps) {
            int number = (step == 'U') ? 1 : -1;
            int temp = level + number;
            if (temp == 0) {
                if (level < 0) {
                    result++;
                }
            }
            level = temp;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
