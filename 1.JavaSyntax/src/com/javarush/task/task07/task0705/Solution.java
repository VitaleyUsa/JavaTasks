package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = new Scanner(System.in).nextInt();
        }
        int [] leftArray = new int[10];
        int [] rightArray = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            if (i < leftArray.length)
                leftArray[i] = bigArray[i];
            else {
                rightArray[i-rightArray.length] = bigArray[i];
            }
        }

        for (int i = 0; i < rightArray.length; i++) {
            System.out.println(rightArray[i]);
        }
    }
}
