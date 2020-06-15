package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human();
        ded1.name = "Ded1";
        ded1.sex = true;
        ded1.age = 72;
        ded1.children = new ArrayList<>();
        Human ded2 = new Human();
        ded2.name = "Ded2";
        ded2.sex = true;
        ded2.age = 72;
        ded2.children = new ArrayList<>();
        Human bab1 = new Human();
        bab1.name = "BB1";
        bab1.sex = true;
        bab1.age = 72;
        bab1.children = new ArrayList<>();
        Human bab2 = new Human();
        bab2.name = "BB2";
        bab2.sex = true;
        bab2.age = 72;
        bab2.children = new ArrayList<>();

        Human otec = new Human();
        otec.name = "Otec";
        otec.sex = true;
        otec.age = 52;
        otec.children = new ArrayList<>();
        ded1.children.add(otec);
        bab1.children.add(otec);

        Human mat = new Human();
        mat.name = "Mat";
        mat.sex = true;
        mat.age = 52;
        mat.children = new ArrayList<>();
        ded2.children.add(mat);
        bab2.children.add(mat);

        Human kid1 = new Human();
        kid1.name = "Kid1";
        kid1.sex = true;
        kid1.age = 12;
        kid1.children = new ArrayList<>();
        otec.children.add(kid1);
        mat.children.add(kid1);
        Human kid2 = new Human();
        kid2.name = "Kid2";
        kid2.sex = true;
        kid2.age = 12;
        otec.children.add(kid2);
        mat.children.add(kid2);
        kid2.children = new ArrayList<>();
        Human kid3 = new Human();
        kid3.name = "Kid3";
        kid3.sex = true;
        kid3.age = 12;
        otec.children.add(kid3);
        mat.children.add(kid3);
        kid3.children = new ArrayList<>();

        ArrayList<Human> humans = new ArrayList<>(Arrays.asList(ded1, ded2, bab1, bab2, otec, mat, kid1, kid2, kid3));
        for (Human human:humans
             ) {
            System.out.println(human);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
