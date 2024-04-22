package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        String j = tr.nextLine();
        System.out.println(dobCha(j));
    }

    public static String dobCha(String j) {

        int len = j.length();
        for (int i = 0; i < len - 1; i++) {
            if (j.charAt(i) == j.charAt(i + 1)) {

                String j1 = j.substring(0, i);
                String j2 = j.substring(i + 1, len);
                String j3 = dobCha(j1 + j2);
                return j3;

            }

        }
        return j;
    }
}