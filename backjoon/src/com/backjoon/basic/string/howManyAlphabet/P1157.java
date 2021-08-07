package com.backjoon.basic.string.howManyAlphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1157 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String word = br.readLine();
            int length = word.length();
            String[] chars = word.split("");
            if (length == 1) {
                System.out.println(word.toUpperCase());
            } else {
                List<String> repo = new ArrayList<>(); // 알파벳 저장소
                List<Integer> count = new ArrayList<>(); // 알파벳의 갯수

                String str;
                for (String one : chars) {
                    String alphabet = one;
                    str = word.replaceAll(alphabet, "");
                    int remain = str.length();
                    count.add(length - remain);
                    if (remain == 0) {
                        break;
                    }
                    length = remain;
                    repo.add(alphabet);
                }
                int max = 0;
                String result = "";
                for (int i = 0; i < count.size(); i++) {
                    if (count.get(i) > max) {
                        max = count.get(i);
                        result = repo.get(i);
                    } else if (count.get(i) == max) {
                        System.out.println("?");
                        break;
                    }
                    if (i == count.size() - 1) {
                        System.out.println(result.toUpperCase());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
