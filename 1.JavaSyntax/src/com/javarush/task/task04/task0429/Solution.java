package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int countPositive = 0, countNegative =  0;
        if (a1 > 0)
            countPositive++;
        else if (a1 < 0)
            countNegative++;
        if (a2 > 0)
            countPositive++;
        else if (a2 < 0)
            countNegative++;
        if (a3 > 0)
            countPositive++;
        else if (a3 < 0)
            countNegative++;

        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);


    }
}
