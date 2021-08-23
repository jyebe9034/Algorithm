package com.backjoon.basic.bruteForce.blackJack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NAndM = br.readLine();
        String[] split = NAndM.split(" ");
        int N = Integer.parseInt(split[0]); // count of cards
        int M = Integer.parseInt(split[1]); // target number
        AtomicInteger result = new AtomicInteger(0);
        String numbers = br.readLine();
        String[] numberArr = numbers.split(" ");
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(numberArr[i]);
        }
        Arrays.stream(numArr).forEach(num1 -> {
            Arrays.stream(numArr).forEach(num2 -> {
                Arrays.stream(numArr).forEach(num3 -> {
                    if (num1 != num2 && num2 != num3 && num1 != num3) {
                        int sum = num1 + num2 + num3;
                        if (sum <= M) {
                            int a = M - result.get();
                            int b = M - sum;
                            if (a > b) {
                                result.set(sum);
                            }
                        }
                    }
                });
            });
        });
        System.out.println(result.get());
    }
}
