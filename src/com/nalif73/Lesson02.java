package com.nalif73;

import java.util.Arrays;

public class Lesson02 {

    public static void main(String[] args) {
        //#1
        int[] massive1 = new int[] { 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i<massive1.length; i++)
            if (massive1[i]==0) massive1[i]=1; else massive1[i]=0;
        System.out.println(Arrays.toString(massive1));

        //#2
        int[] massive2 = new int[8];
        int k=0;
        for (int i=0; i<massive2.length; i++)
        { massive2[i]=k; k+=3; }
        System.out.println(Arrays.toString(massive2));

        //#3
        int[] massive3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<massive3.length; i++)
         if (massive3[i]<6) massive3[i]*=2;
        System.out.println(Arrays.toString(massive3));
        System.out.println();

        //#4
        int[][] massive4 = new int[7][7];
        for (int i=0; i<massive4.length; i++)
           for (int j=0; j<massive4[0].length; j++)
                   if ((i==j) || (i+j+1)==massive4.length) massive4[i][j]=1;
            for (int i=0; i<massive4.length; i++)
            System.out.println(Arrays.toString(massive4[i]));
        System.out.println();

        //#5
        int[] massive5 = new int[] {-81, 57, 33, -20, 101, 454, -555, 52, 24, 800, 239, -155};
        int min=massive5[0], max=massive5[0];
        for (int i=0; i<massive5.length; i++)
           {
            if (massive5[i]<min) min=massive5[i];
            if (massive5[i]>max) max=massive5[i];
           }
        System.out.println("max=" + max + " min=" + min);

            }

    }


