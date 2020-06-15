package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }
        String max = strings.get(0);
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max.length())
                max = strings.get(i);
        }

        for (String s: strings
             ) {
            if (s.length() == max.length())
                System.out.println(s);
        }
    }
}
