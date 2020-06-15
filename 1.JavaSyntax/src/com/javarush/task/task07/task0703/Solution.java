package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] intArray = new int[10];
        String[] StringArray = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < StringArray.length; i++) {
            StringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < StringArray.length; i++) {
            intArray[i] = StringArray[i].length();
        }

        for (int i: intArray) {
            System.out.println(i);
        }

    }
}
