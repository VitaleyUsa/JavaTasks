package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine());
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (i == 0){
                strings.add(strings.get(i));
                strings.remove(strings.get(i));
            }
            else {
                count++;
                strings.add(strings.get(count-i));
                strings.remove(strings.get(count-i));
            }
        }


        for (String s:strings
             ) {
            System.out.println(s);
        }
        //напишите тут ваш код
    }
}
