package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.color = "yellow";
        this.address = null;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "yellow";
        this.address = null;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "yellow";
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color, String address){
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
