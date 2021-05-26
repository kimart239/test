package com.company;

public class romeToarab {
     public static int rta(String ra){
        if (ra.equals("0")) return 0;
        if (ra.equals("I")) return 1;
        if (ra.equals("II")) return 2;
        if (ra.equals("III")) return 3;
        if (ra.equals("IV")) return 4;
        if (ra.equals("V")) return 5;
        if (ra.equals("VI"))  return 6;
        if (ra.equals("VII")) return 7;
        if (ra.equals("VIII")) return 8;
        if (ra.equals("IX")) return 9;
        if (ra.equals("X")) return 10;
        return -1;
    }
}
