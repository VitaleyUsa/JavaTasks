package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Ivanov","Vasya");
        map.put("Petrov","Vasya");
        map.put("Sidorov","Petya");
        map.put("Sitnikov","Vitala");
        map.put("Stihin","Kolya");
        map.put("Vyazev","Vasya");
        map.put("Mishin","Vanya");
        map.put("Topolev","Vanya");
        map.put("Gagarin","Sasha");
        map.put("Ranen","Grek");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        final Integer[] count = {0};
        map.forEach((k,v) -> {
            if (v.equals(name))
                count[0]++;
        });
        return count[0];
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        final Integer[] count = {0};
        map.forEach((k,v) -> {
            if (k.equals(lastName))
                count[0]++;
        });
        return count[0];
    }

    public static void main(String[] args) {

    }
}
