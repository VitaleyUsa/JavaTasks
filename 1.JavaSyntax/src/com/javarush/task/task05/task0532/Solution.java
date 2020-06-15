package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int currentNumber = 0;
        int prevNumber = -2147483648;
        int max = 0;
        while(true) {
           n = Integer.parseInt(reader.readLine());
           if (n > 0) break;
           else return;
        }

        for (int i = 0; i < n; i++) {
            currentNumber = Integer.parseInt(reader.readLine());
            max = Math.max(currentNumber, prevNumber);

            prevNumber = max;
        }

        System.out.println(max);
    }
}
