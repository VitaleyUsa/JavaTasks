package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(String.valueOf(i));
        }
        System.out.println(arrayList.size());

        for (String i : arrayList
             ) {
            System.out.println(i);
        }
    }
}
