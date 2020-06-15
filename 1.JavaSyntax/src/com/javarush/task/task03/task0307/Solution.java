package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zergs = new Zerg[5];
        Protoss[] protosses = new Protoss[4];
        Terran[] terrans = new Terran[5];

        for (int i = 0; i <= 4; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = String.valueOf(i);
        }

        for (int i = 0; i <= 2; i++) {
            protosses[i] = new Protoss();
            protosses[i].name = String.valueOf(i);
        }

        for (int i = 0; i <= 3; i++) {
            terrans[i] = new Terran();
            terrans[i].name = String.valueOf(i);
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
