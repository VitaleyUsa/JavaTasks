package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.address = null;
        this.color = "yellow";
        this.age = this.weight = 5;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.address = null;
        this.color = "yellow";
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name, int age){
        this.name = name;
        this.address = null;
        this.color = "yellow";
        this.age = age;
        this.weight = 5;
    }
    public Cat(int weight, String color){
        this.name = null;
        this.address = null;
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address){
        this.name = null;
        this.address = address;
        this.color = color;
        this.age = 5;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
