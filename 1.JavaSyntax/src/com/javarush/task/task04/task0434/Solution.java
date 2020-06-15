package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int countHorizontal = 1, countVertical = 1;
        while (countVertical <= 10){
            countHorizontal = 1;
            while (countHorizontal <=10){
                System.out.print(countHorizontal * countVertical + " ");
                countHorizontal++;
            }
            System.out.println();
            countVertical++;
        }
    }
}
