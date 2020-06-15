package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] integers = new int[20];
        int maximum;
        int minimum;

        //напишите тут ваш код
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(reader.readLine());
        }
        maximum = integers[0];
        minimum = integers[0];
        for (int i = 1, integersLength = integers.length; i < integersLength; i++) {
            int integer = integers[i];
            if (integer > maximum)
                maximum = integer;
            else if (integer < minimum)
                minimum = integer;
        }

        System.out.printf("%d %d", maximum, minimum);
    }
}
