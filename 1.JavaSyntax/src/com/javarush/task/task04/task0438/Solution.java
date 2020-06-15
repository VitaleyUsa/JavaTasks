package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int j = 1; j <= 11; j++) {
            for (int i = 1; i <= 10; i++) {
                if (j == 1)
                    System.out.print("8");
                else
                    if (i == 1)
                        System.out.print("8");
            }
            System.out.println();
        }
    }
}
