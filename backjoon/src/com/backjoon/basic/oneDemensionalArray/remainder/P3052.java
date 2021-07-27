package com.backjoon.basic.oneDemensionalArray.remainder;

import java.util.ArrayList;
import java.util.Scanner;

public class P3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 42;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(sc.nextLine());
            int remainder = input % number;
            boolean isTheSame = list.stream().anyMatch(one -> one == remainder);
            if (!isTheSame) {
                list.add(remainder);
            }
        }
        System.out.println(list.size());
    }
}
