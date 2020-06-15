package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        if (string.substring(0, 1).equals(" "))
            string = string.replaceFirst("\\s+","");
        String[] strings = string.split("\\s+");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i].substring(0,1).toUpperCase() + strings[i].substring(1));
            if (i != strings.length - 1)
                System.out.print(" ");
        }

        //напишите тут ваш код
    }
}
