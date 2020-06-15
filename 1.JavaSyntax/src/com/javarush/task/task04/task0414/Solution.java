package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());
        System.out.println("количество дней в году: " + checkYear(year));

    }

    public static int checkYear(int year){
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            return 366;

        return 365;
    }
}