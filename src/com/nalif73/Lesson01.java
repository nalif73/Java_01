package com.nalif73;

public class Lesson01 {
    // #1
    public static void main(String[] args) {
    // #2
        byte a = 10;
        short b = 32000;
        int c = 129000000;
        long d = 92233720368547L;
        float e = 187873244538987.98090F;
        double f = 8932478934238478923743232.897988897987D;
        boolean g = false;
        char i = 'i';
    //#3
        System.out.println(method3(133.567F,2390.3837F,3789989.898F,43232.909F));
    //#4
        System.out.println(method4(4, 19));
    //#5
        System.out.println(method5(-44));
    //#6
        System.out.println(method6(-44));
    //#7
        System.out.println(method7("Вася"));
    //#8
        System.out.println(method8(2000));

    }
    //#3
    public static float method3 (float a, float b, float c, float d) {
        return  a * (b + (c / d));
    }
    //#4
    public static boolean method4 (int a, int b) {
       if ((a+b)>=10 && (a+b)<=20) return true;
         return false;
    }
    //#5
    public static String method5 (int a) {
        if  (a>=0) return "Положительное число";
        return "Отрицательное число";
    }
    //#6
    public static boolean method6 (int a) {
        if  (a>=0) return true;
        return false;
    }
    //#7
    public static String method7 (String a) {
        return "Привет, "+ a + "!";
    }
    //#8
    public static String method8 (int a) {
        if ((a%4==0 && a%100!=0) || a%400==0) return a + " год високосный";
        return a + " год невисокосный";
    }
}
