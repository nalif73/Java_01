package com.nalif73;

import java.util.Random;
import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Я загадал слово (овощ/фрукт), отгадай его");
        guess(makeWord(), scanner.nextLine());
        scanner.close();


    }
    public static String makeWord () {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        return words[rand.nextInt(words.length)];
    }
    public static void guess (String hidden, String s)
    {
        Scanner scanner = new Scanner(System.in);
        String x="";
        int n=0, counter=1;
        char a, b;
        // System.out.println(hidden);
        while (!s.equals(hidden)) {

            if (hidden.length() < s.length()) n = hidden.length() ;
            else n = s.length();
            for (int i=0; i<n; i++) {
                a = hidden.charAt(i);
                b = s.charAt(i);
                if (a==b) x+=a; else x+='#';
            }
            x+="###############";
            System.out.println(x);
            x="";
            s = scanner.nextLine();
            counter++;
        }
        System.out.println("Поздравляю! Вы угадали загаданное слово " + hidden + " с " + counter + " попытки");
        scanner.close();
    }
}
