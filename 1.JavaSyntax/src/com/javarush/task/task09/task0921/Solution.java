package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        while (true)
        {
            try{
                integers.add(Integer.parseInt(bufferedReader.readLine()));}
            catch (NumberFormatException | IOException e){integers.forEach(System.out::println); break;}
        }
        }

    }
