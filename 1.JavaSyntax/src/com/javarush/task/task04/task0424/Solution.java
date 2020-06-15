package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int position = 0;

        if (a1 != a2 && a1 != a3)
            position = 1;

        if (a2 != a1 && a2 != a3)
            position = 2;

        if (a3 != a1 && a3 != a2)
            position = 3;

        if (a1 != a2 && a2 != a3 && a3 != a1)
            position = 0;
        else
            System.out.println(position);

    }
}
