package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Fam1", 600);
        map.put("Fam2", 400);
        map.put("Fam3", 500);
        map.put("Fam4", 400);
        map.put("Fam5", 900);
        map.put("Fam6", 900);
        map.put("Fam7", 450);
        map.put("Fam8", 490);
        map.put("Fam9", 510);
        map.put("Fam10", 400);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair: copyMap.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey(),pair.getValue());
        }
    }

    public static void main(String[] args) {

    }
}