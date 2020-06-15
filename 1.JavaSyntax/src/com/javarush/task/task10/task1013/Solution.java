package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private Integer age;
        private Human human;
        private String name;
        private Boolean sex;
        private int money;
        private int debt;

        public Human(int age, String name, Boolean sex, int money, int debt){
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.money = money;
            this.debt = debt;
        }
        public Human(String name, int age, Boolean sex, int money, int debt){
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.money = money;
            this.debt = debt;
        }
        public Human(Boolean sex, String name, int age, int money, int debt){
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.money = money;
            this.debt = debt;
        }
        public Human(String name, Boolean sex, int money, int debt){
            this.age = null;
            this.name = name;
            this.sex = sex;
            this.money = money;
            this.debt = debt;
        }
        public Human(Boolean sex, int money, int debt){
            this.age = null;
            this.name = null;
            this.sex = sex;
            this.money = money;
            this.debt = debt;
        }
        public Human(int money, int debt){
            this.age = null;
            this.name = null;
            this.sex = false;
            this.money = money;
            this.debt = debt;
        }
        public Human(int debt){
            this.age = null;
            this.name = null;
            this.sex = false;
            this.money = 0;
            this.debt = debt;
        }
        public Human(){
            this.age = null;
            this.name = null;
            this.sex = false;
            this.money = 0;
            this.debt = 0;
        }
        public Human(Human human){
            this.age = null;
            this.name = null;
            this.sex = false;
            this.money = 0;
            this.debt = 0;
            this.human = human;
        }
        public Human(Human human, String name){
            this.age = null;
            this.name = name;
            this.sex = false;
            this.money = 0;
            this.debt = 0;
            this.human = human;
        }
    }
}
