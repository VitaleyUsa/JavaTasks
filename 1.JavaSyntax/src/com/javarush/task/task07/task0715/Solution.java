package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "мама", "мыла", "раму");

        for (int i = 0; i < strings.size(); i++) strings.add(++i, "именно");

        for (String s: strings
             ) {
            System.out.println(s);
        }
    }
}
