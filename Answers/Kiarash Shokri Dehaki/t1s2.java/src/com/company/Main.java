package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tr = new Scanner (System.in);
        String a = tr.nextLine();
        boolean sch = tr.hasNextBoolean();
        oddEven(a,sch);
    }

    public static void oddEven(String a , boolean sch){

        int fard = 0 ;
        int zoj = 0  ;
        int len = a.length();
        for(int i=0 ; i<len;i++){
            int bb = a.charAt(i);
            if(bb % 2 ==1){

                fard++;
            }
            else  {

                zoj++;
            }
        }

        if ( sch == true ) {
            System.out.println(zoj);
        }
        else {
            System.out.println(fard);
        }
    }
}
