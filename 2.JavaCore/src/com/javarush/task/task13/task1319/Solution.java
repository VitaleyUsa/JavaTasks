package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        ArrayList<String> arrayList = new ArrayList<>();

        String temp = "";
        do {
            temp = bufferedReader.readLine();
            arrayList.add(temp);
        } while (!temp.equals("exit"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String value : arrayList) {
                writer.write(value + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
