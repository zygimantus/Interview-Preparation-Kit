package com.zygimantus.hackerrank.ipk.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int result = 0;
        // loop for shift value, total of 16 combinations
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = calculateSum(arr, i, j);
                if (temp > result || (i == 0 && j == 0))
                    result = temp;
            }
        }

        return result;
    }

    private static int calculateSum(int[][] arr, int shift_i, int shift_j) {

        int result = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result += arr[i + shift_i][j + shift_j];
            }
        }
        result = result - arr[1 + shift_i][0 + shift_j];
        result = result - arr[1 + shift_i][2 + shift_j];
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
