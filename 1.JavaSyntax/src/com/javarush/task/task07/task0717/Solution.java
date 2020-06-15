package com.javarush.task.task07.task0717;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Scanner(System.in).nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s: result
             ) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();
        for (String s : list
             ) {
            result.add(s);
            result.add(s);
        }

        return result;
    }
}
