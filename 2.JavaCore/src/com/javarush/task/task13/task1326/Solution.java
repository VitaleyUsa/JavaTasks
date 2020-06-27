package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> integers = new ArrayList<>();
        int i;

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        StringBuilder stringBuilder = new StringBuilder();
        while((i = bufferedInputStream.read()) != -1)
            stringBuilder.append((char)i);

        bufferedInputStream.close();
        fileInputStream.close();

        String[] strings = stringBuilder.toString().split("\n");

        for (String item: strings
             ) {
            if (Integer.parseInt(item) % 2 == 0)
                integers.add(Integer.parseInt(item));
        }

        Collections.sort(integers);
        integers.forEach(System.out::println);
    }

}
