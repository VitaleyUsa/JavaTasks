package com.javarush.task.task07.task0706;

import java.io.IOException;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] array = new int[15];
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 || i == 0)
                sumEven += array[i];
            else
                sumOdd += array[i];
        }
        if (sumEven > sumOdd)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
