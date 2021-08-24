package com.backjoon.basic.bruteForce.decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int decomposition = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = decomposition - 1; i > 0; i--) {
            String toString = Objects.toString(i);
            String[] split = toString.split("");
            int sum = i;
            for (String one : split) {
                sum += Integer.parseInt(one);
            }
            if (decomposition == sum) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
