package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double timeLeft = scanner.nextDouble();
        System.out.println(checkSignal(timeLeft));
    }

    public static String checkSignal(double timeLeft) throws Exception {
        double time;
        time = timeLeft % 5;

        if (time < 3 && time >= 0)
            return "зелёный";
        else if (time < 4 && time >= 3)
            return "жёлтый";
        else
            return "красный";
    }
}