package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        findDouble(a, b, c);
    }
    public static void findDouble(int a, int b, int c){
        int temp_a;
        int temp_b;

        if (a == b && a == c && b == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b || a == c)
            System.out.println(a + " " + a);
        else if (b == c)
            System.out.println(b + " " + b);
    }
}