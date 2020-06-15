package com.javarush.task.task07.task0718;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int index = Integer.MIN_VALUE;
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (i + 1 < strings.size())
                if (strings.get(i+1).length() < strings.get(i).length()){
                    if (index == Integer.MIN_VALUE)
                        index = i+1;
            else
                break;
            }
        }
        if (index != Integer.MIN_VALUE)
            System.out.println(index);
    }
}

