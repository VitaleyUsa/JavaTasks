package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
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
        String tempS;
        for (int i = 0; i < 13; i++) {
            tempS = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0, tempS);
        }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
