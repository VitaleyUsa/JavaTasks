package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static int even;
    public static int odd;

    public static void checkEvenOdd(int number){
        while (number > 0) {
            final int lastDigit = number % 10;
            if (lastDigit % 2 == 0){even++;}
            else {
                odd++;
            }
            number /= 10;
        }

    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        checkEvenOdd(number);
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
