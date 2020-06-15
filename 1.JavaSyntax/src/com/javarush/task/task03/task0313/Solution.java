package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void permutation(Object[] s) {
        Object[] original = s;
        Arrays.sort(original);
        Object[] clone = new Object[s.length];
        boolean[] mark = new boolean[s.length];
        Arrays.fill(mark, false);
        permute(original, clone, mark, 0, s.length);
    }

    private static void permute(Object[] original, Object[] clone, boolean[] mark, int length, int n) {
        if (length == n) {
            System.out.println(clone[0].toString() + clone[1] + clone[2]);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == true) continue;
            // dont use this state. to keep order of duplicate character
            if (i > 0 && original[i] == original[i-1] && mark[i-1] == false) continue;
            mark[i] = true;
            clone[length] = original[i];
            permute(original, clone, mark, length+1, n);
            mark[i] = false;
        }

    }

    public static void main(String[] args) {
        //напишите тут ваш код
        permutation(new String [] {"Мама", "Мыла", "Раму"});
    }
}
