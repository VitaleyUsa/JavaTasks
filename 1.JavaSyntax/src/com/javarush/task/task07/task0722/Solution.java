package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        //напишите тут ваш код
        while(true){
            strings.add(reader.readLine());
            if (strings.get(strings.size()-1).equals("end")){
                break;
            }
        }
        strings.remove(strings.size()-1);
        for (String s:strings
             ) {
            System.out.println(s);
        }
    }
}