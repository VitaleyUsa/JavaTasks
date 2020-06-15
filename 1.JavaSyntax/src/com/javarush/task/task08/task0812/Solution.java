package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            integers.add(scanner.nextInt());
        }
        int count = 0, tmpCount = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (i != integers.size()-1 && integers.get(i).equals(integers.get(i + 1))) tmpCount++;
            else if (i != 0 && integers.get(i).equals(integers.get(i-1)))
            {
                tmpCount++;
                if (tmpCount > count) count = tmpCount;
                tmpCount = 0;
            }
            else tmpCount = 0;
        }

        System.out.println(count == 0 ? 1 : count);
    }
}