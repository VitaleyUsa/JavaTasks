package com.javarush.task.task08.task0822;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        Integer min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < min)
                min = array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            integers.add(scanner.nextInt());
        }

        return integers;
    }
}
