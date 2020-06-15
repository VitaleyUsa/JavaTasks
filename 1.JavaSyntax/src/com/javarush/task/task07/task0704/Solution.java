package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}

