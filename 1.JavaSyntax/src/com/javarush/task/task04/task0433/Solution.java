package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int countHorizontal = 10;
        int countVertical = 10;

        while (countVertical > 0){
            countHorizontal = 10;
            while(countHorizontal > 0){
                System.out.print("S");
                countHorizontal--;
            }
            System.out.println();
            countVertical--;
        }
    }
}
