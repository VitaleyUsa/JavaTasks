package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
        this.width = this.height = 0;
    }
    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = this.top = width;
    }

    public void initialize(Rectangle rectangle){
        this.width = rectangle.width;
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.top = rectangle.top;
    }


    public static void main(String[] args) {

    }
}
