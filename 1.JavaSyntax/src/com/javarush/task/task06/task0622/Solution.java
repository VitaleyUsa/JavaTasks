package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        //напишите тут ваш код
        for (int i: sort(numbers)
             ) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> numbers){
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        if (numbers.size() < 2)
            return numbers;
        else{
            int first = numbers.get(0);
            numbers.remove(0);

            for (int i: numbers) {
                if (i <= first){
                    less.add(i);
                }
                else {
                    greater.add(i);
                }
            }
            ArrayList<Integer> temp_less = sort(less);
            temp_less.add(first);
            temp_less.addAll(sort(greater));
            return temp_less;
        }


    }
}
