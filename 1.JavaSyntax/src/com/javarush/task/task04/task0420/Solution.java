package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        sortInt3(a, b, c);
    }

    private static void sortInt3(int a, int b, int c) {
        Map<Integer, Integer> row = new HashMap<Integer, Integer>();
        row.put(1, a);
        row.put(2, b);
        row.put(3, c);

        if (b <= a && b <= c) {
            row.remove(1);
            row.put(1, b);
        }
        else if (c <= a && c <= b) {
            row.remove(1);
            row.put(1, c);
        }
        if (b >= a && b >= c) {
            row.remove(3);
            row.put(3, b);
        }
        else if (a >= c && a >= b) {
            row.remove(3);
            row.put(3, a);
        }
        
        if ((a >= b && a <= c) || (a <= b && a >= c)){
            row.remove(2);
            row.put(2, a);
        }
        if ((c >= a && c <= b) || (c <= a && c >= b)){
            row.remove(2);
            row.put(2, c);
        }

        int temp = row.get(3);
        row.put(3, row.get(1));
        row.put(1, temp);

        System.out.print(row.get(1) + " " + row.get(2) + " " + row.get(3));

    }



}
