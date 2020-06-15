package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sTime = reader.readLine();
        int time = Integer.parseInt(sTime);
        String sName = reader.readLine();
        
        System.out.println(sName + " захватит мир через " + time + " лет.");
        System.out.println("Му-ха-ха!");
    }
}
