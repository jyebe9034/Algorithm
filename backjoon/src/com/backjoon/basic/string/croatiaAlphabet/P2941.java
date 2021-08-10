package com.backjoon.basic.string.croatiaAlphabet;

import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] croatian = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String one : croatian) {
            input = input.replaceAll(one, "a");
        }
        System.out.println(input.length());
    }
}
