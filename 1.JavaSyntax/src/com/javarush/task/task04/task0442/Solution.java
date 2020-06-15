package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            int number = scanner.nextInt();
            count = count + number;
            if (number == -1)
                break;
        }
        System.out.println(count);
    }
}
