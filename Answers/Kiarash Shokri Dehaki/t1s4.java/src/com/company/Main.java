package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tr = new Scanner (System.in);
        String a = tr.nextLine();
        String w = tr.nextLine();
        String nw = tr.nextLine();
        wordCen(a,w,nw);
    }
    public static void wordCen(String a,String w,String nw){

        int s =a.indexOf(w);
        int v = s + w.length();
        int e = a.length();
        String v1 = a.substring(0,s);
        String v2 = a.substring(v,e);
        System.out.println(v1 + nw + v2);
    }
}
