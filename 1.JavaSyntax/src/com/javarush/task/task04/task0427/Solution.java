package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1 && number <= 999)
            if (number % 2 == 0)
                System.out.println("четное " + signs(number));
            else
                System.out.println("нечетное "+ signs(number));

    }

    public static String signs(int number){
        if (number <= 9)
            return "однозначное число";
        if (number >=10 && number <= 99)
            return "двузначное число";
        if (number >=100 && number <= 999)
            return "трехзначное число";
        return "";
    }
}
