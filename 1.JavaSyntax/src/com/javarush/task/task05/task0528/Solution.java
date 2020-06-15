package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String month = LocalDate.now().getMonthValue()<10?("0" + LocalDate.now().getMonthValue()): String.valueOf(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().getDayOfMonth() + " " + month + " " + LocalDate.now().getYear());
    }
}
