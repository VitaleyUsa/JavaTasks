package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        Date tmpDate = sdf.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(tmpDate);
        return (cal.get(Calendar.DAY_OF_YEAR)) % 2 != 0 || (cal.get(Calendar.DAY_OF_YEAR) == 1);
    }
}
