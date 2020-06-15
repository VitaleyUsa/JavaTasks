package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Enumeration;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true){
            int number = scanner.nextInt();
            if (number == -1)
                break;
            count++;
            sum += number;
        }
        System.out.println((double)sum / count);
    }
}

