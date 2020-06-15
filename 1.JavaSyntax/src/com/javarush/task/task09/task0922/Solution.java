package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(new Scanner(System.in).nextLine());
        dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        System.out.println(dateFormat.format(date).toUpperCase());
    }
}
