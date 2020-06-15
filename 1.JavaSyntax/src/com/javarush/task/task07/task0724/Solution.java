package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Human> humans = new ArrayList<>();
        Human grandFather1 = new Human("Ded1", true,92);
        Human grandFather2 = new Human("Ded2", true,82);
        Human grandMother1 = new Human("Babula1", false,82);
        Human grandMother2 = new Human("Babula2", false,82);
        Human Father = new Human("Otec", true,52, grandFather1, grandMother1);
        Human Mother = new Human("Mat", false,42, grandFather2, grandMother2);
        Human Kid1 = new Human("Kid1", true,12, Father, Mother);
        Human Kid2 = new Human("Kid2", true,22, Father, Mother);
        Human Kid3 = new Human("Kid3", true,13, Father, Mother);
        Collections.addAll(humans, grandFather1, grandFather2, grandMother1, grandMother2, Father, Mother, Kid1, Kid2, Kid3);

        for (Human human: humans
             ) {
            System.out.println(human);
        }

    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}