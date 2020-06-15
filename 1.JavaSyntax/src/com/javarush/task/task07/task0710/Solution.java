package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            strings.add(0, new Scanner(System.in).nextLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
