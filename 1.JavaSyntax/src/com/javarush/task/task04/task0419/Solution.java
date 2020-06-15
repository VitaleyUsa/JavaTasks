package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();

        findMax4(a1, a2, a3, a4);
    }

    private static void findMax4(int a1, int a2, int a3, int a4) {
        if (a1 == a2 && a1 == a3 && a1 == a4)
            System.out.println(a1);
        else if (findMax2(a1, a2) > findMax2(a3, a4))
            System.out.println(findMax2(a1,a2));
        else
            System.out.println(findMax2(a3, a4));
    }

    private static int findMax2(int a1, int a2){
        if (a1 > a2)
            return a1;
        return a2;
    }
}
