package com.matuageorge.code_monk;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int x = 0; x < t; x++) {
            String[] input1 = scanner.nextLine().split(" ");
            int n = Integer.parseInt(input1[0]);
            int k = Integer.parseInt(input1[1]);

            String[] A = scanner.nextLine().split(" ");
            String[] temp = new String[n];
            for (int i = 0; i < k; i++) {
                temp[0] = A[n - 1];
                for (int j = 0, kk = 1; j < n - 1 && kk < n; j++, kk++) {
                    temp[kk] = A[j];
                }
                A = temp;
                temp = new String[n];
            }
            String result = "";
            for (String a : A) {
                result += a + " ";
            }
            System.out.println(result.trim());
        }
    }
}