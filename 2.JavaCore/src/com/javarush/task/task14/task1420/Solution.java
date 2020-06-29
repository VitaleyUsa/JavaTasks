package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0, number2 = 0, min = 0, nod = 0;

        number1 = Integer.parseInt(bufferedReader.readLine());
        number2 = Integer.parseInt(bufferedReader.readLine());
        if (number1 <= 0 || number2 <= 0)
            throw new Exception();

        for (int i = 1; i <= (min = Math.min(number1,number2)); i++) {
            if (number1 % i == 0 && number2 % i == 0)
                nod = i;
        }

        System.out.println(nod);
    }

}
