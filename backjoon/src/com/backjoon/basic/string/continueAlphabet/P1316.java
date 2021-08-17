package com.backjoon.basic.string.continueAlphabet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int words = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < words; i++) {
            String word = sc.nextLine();
            List<Character> list = new ArrayList<>();

            if (word.length() == 1) {
                count++;
            } else {
                for (int j = 0; j < word.length()-1; j++) {
                    char first = word.charAt(j);
                    char second = word.charAt(j + 1);

                    if (first == second) {
                        continue;
                    } else {
                        list.add(first);
                        if (list.contains(second)) {
                            break;
                        }
                    }
                    if (j == word.length() - 2) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
