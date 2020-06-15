package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }
        strings.remove(2);
        for (int i = strings.size()-1; i >= 0 ; i--) {
            System.out.println(strings.get(i));
        }
    }
}
