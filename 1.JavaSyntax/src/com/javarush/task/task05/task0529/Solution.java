package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
           if (scanner.hasNextInt()) sum += scanner.nextInt();
           if (scanner.hasNextLine()) if (scanner.nextLine().equals("сумма")) break;
        }
        System.out.println(sum);
    }
}
