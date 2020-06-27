package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();

            FileInputStream fileInputStream = new FileInputStream(filename);
            int data;
            while ((data = fileInputStream.read()) != - 1){System.out.print((char) data);}

            reader.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}