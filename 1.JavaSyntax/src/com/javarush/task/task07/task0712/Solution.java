package com.javarush.task.task07.task0712;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }

        int min = strings.get(0).length(), max = strings.get(0).length();
        for (String string : strings) {
            if (string.length() < min)
                min = string.length();
            if (string.length() > max)
                max = string.length();
        }
        ArrayList<Integer> minIndex = new ArrayList<>();
        ArrayList<Integer> maxIndex = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min)
                minIndex.add(i);
            if (strings.get(i).length() == max)
                maxIndex.add(i);
        }
        if (minIndex.get(0) < maxIndex.get(0))
            System.out.println(strings.get(minIndex.get(0)));
        else
            System.out.println(strings.get(maxIndex.get(0)));
    }
}
