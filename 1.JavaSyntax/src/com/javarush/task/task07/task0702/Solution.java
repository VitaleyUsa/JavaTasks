package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}