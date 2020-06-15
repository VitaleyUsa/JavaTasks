package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }

        int min = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min)
                min = strings.get(i).length();
        }

        for (String s : strings
             ) {
            if (s.length() == min)
                System.out.println(s);
        }
    }
}
