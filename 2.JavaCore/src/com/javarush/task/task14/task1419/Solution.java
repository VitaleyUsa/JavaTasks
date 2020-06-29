package com.javarush.task.task14.task1419;


import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        int [] array = {1};

        try {
            array[2] = 5;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try{
            throw new NullPointerException("NullPointerException");
        }
        catch (NullPointerException e) {
            exceptions.add(e);
        }

        try{
            throw new ClassNotFoundException("ClassNotFoundException");
        }
        catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        try{
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try{
            throw new IllegalAccessException("IllegalAccessException");
        }
        catch (IllegalAccessException e) {
            exceptions.add(e);
        }

        try{
            throw new IllegalStateException("IllegalStateException");
        }
        catch (IllegalStateException e) {
            exceptions.add(e);
        }

        try{
            throw new NoSuchMethodException("NoSuchMethodException");
        }
        catch (NoSuchMethodException e) {
            exceptions.add(e);
        }

        try{
            throw new ClassCastException("ClassCastException");
        }
        catch (ClassCastException e) {
            exceptions.add(e);
        }

        try{
            throw new NoSuchFieldException("NoSuchFieldException");
        }
        catch (NoSuchFieldException e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
