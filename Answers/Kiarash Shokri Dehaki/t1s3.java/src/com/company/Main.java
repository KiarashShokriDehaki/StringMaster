package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        String a = tr.next();
        String b = tr.next();
        firstWord(a,b);
    }
    public static void firstWord(String a, String b){
         int lena = a.length();

        int lenb = b.length();
        int i=0;
        while (true){
            char c1 =a.charAt(i);
            char c =b.charAt(i);
            int b1 = (char)c;
            int a1 = (char)c1;
            if (a1<b1){
                System.out.println(a);
                break;
            }
            else if(b1<a1){
                System.out.println(b);
                break;
            }
            else{
                i++;
            }
        }
    }
}
