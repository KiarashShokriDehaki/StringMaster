package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner tr = new Scanner(System.in);
        String a = tr.nextLine();
        int b = tr.nextInt();
        wordFinder(a, b);
        // write your code here
    }

    public static void wordFinder(String a, int b) {

        int len = a.length();
        int shom = 0;
        int adadcarbar = 1;

        for (int i = 0; i < len; i++) {

            if (adadcarbar == b) {
                System.out.println(a.substring(shom, ++i));

                break;
            } else {

                shom = ++i;
                adadcarbar++;
            }
        }

        if (adadcarbar > b) {

            System.out.println("is out of bound");
        }

    }
}