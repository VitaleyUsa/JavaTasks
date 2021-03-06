package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String myString = bufferedReader.readLine();
        StringBuilder vowels = new StringBuilder();
        StringBuilder notVowels = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            if (isVowel(myString.charAt(i)))
                vowels.append(myString.charAt(i)).append(" ");
            else if (myString.charAt(i) != ' ')
                notVowels.append(myString.charAt(i)).append(" ");
        }
        System.out.println(vowels);
        System.out.println(notVowels);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}