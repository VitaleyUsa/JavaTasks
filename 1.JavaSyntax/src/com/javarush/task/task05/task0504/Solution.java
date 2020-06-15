package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat Vaska1 = new Cat("Vasja", 3, 3, 3);
        Cat Vaska2 = new Cat("Vasja", 3, 3, 3);
        Cat Vaska3 = new Cat("Vasja", 3, 3, 3);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}