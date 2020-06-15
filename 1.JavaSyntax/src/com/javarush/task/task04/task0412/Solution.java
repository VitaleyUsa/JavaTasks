package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int finalNumber;

        if (number == 0)
            finalNumber = 0;
        else
            finalNumber = (number > 0) ? number * 2 : number + 1;

        System.out.println(finalNumber);
    }

}