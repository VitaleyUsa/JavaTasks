package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Vasin","Vasya");
        map.put("Vasin1","Vasya1");
        map.put("Vasin2","Vasya3");
        map.put("Vasin3","Vasya3");
        map.put("Vasin4","Vasya4");
        map.put("Vasin","Vasya2");
        map.put("Vasin6","Vasya5");
        map.put("Vasin7","Vasya6");
        map.put("Vasin8","Vasya7");
        map.put("Vasin9","Vasya8");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
