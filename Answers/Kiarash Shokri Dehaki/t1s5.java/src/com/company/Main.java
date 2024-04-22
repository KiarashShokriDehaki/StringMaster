package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tr = new Scanner (System.in);
        String ek = tr.nextLine();
        String eb = tr.nextLine();
        norMa(ek,eb);
    }
    public static void norMa(String ek,String eb){
        String ek1 = ek.toLowerCase();
        String eb1 = eb.toLowerCase();
        String a = ek.substring(0,1);
        String b = eb.substring(0,1);
        String a1 = a.toUpperCase();
        String b1 = b.toUpperCase();
        String a2 = a1 + ek1.substring(1);
        String b2 = b1 + eb1.substring(1);
        System.out.println(a2 + " " + b2);
    }
}
