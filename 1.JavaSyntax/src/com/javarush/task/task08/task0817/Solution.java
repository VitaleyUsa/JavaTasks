package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Fam","Imya");
        map.put("Fam1","Imya1");
        map.put("Fam2","Imya3");
        map.put("Fam3","Imya2");
        map.put("Fam4","Imya2");
        map.put("Fam5","Imya1");
        map.put("Fam6","Imya4");
        map.put("Fam7","Imya5");
        map.put("Fam8","Imya5");
        map.put("Fam9","Imya6");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String,String> copy = new HashMap<>(map);
       for (Map.Entry<String, String> pair : copy.entrySet()){
           for (Map.Entry<String, String> innerPair : copy.entrySet()){
               if (pair.getValue().equals(innerPair.getValue()) && !pair.getKey().equals(innerPair.getKey()))
                   removeItemFromMapByValue(map, pair.getValue());
           }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
