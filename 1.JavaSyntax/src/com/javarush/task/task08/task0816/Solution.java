package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("JUN 30 2012"));
        map.put("Сталлоне3", dateFormat.parse("FEB 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("JAN 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("JUL 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("OCT 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("NOV 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("DEC 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() < 8);
    }

    public static void main(String[] args) throws ParseException {

    }
}
