package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        if (a1 == a2 && a2 == a3)
            System.out.println(a1);
        else
            findMiddle(a1, a2, a3);
    }

    private static void findMiddle(int a1, int a2, int a3) {
        int max = Math.max(a1, a2);
        max = Math.max(max, a3);
        int min = Math.min(a1, a2);
        min = Math.min(min, a3);

        if ((a1 != max && a1 != min) || (a1 == a2 || a1 == a3))
            System.out.println(a1);
        if ((a2 != max && a2 != min) || (a2 == a3))
            System.out.println(a2);
        if (a3 != max && a3 != min)
            System.out.println(a3);

    }
}
