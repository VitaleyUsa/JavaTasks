package com.javarush.task.task07.task0713;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> globalArrayList = new ArrayList<>();
        ArrayList<Integer> arrayListDiv3 = new ArrayList<>();
        ArrayList<Integer> arrayListDiv2 = new ArrayList<>();
        ArrayList<Integer> arrayListOther = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20 ; i++) {
            globalArrayList.add(scanner.nextInt());
        }
        for (Integer integer : globalArrayList) {
            if (integer % 3 == 0)
                arrayListDiv3.add(integer);
            if (integer % 2 == 0)
                arrayListDiv2.add(integer);
            if (integer % 2 != 0 && integer % 3 != 0)
                arrayListOther.add(integer);
        }
        System.out.println("div 3:");
        printList(arrayListDiv3);
        System.out.println("div 2:");
        printList(arrayListDiv2);
        System.out.println("others:");
        printList(arrayListOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i : list
             ) {
            System.out.println(i);
        }
    }
}
