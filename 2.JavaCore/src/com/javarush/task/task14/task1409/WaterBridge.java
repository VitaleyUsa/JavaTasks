package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge{
    final private int count = 10;
    @Override
    public int getCarsCount() {
        return count;
    }
}
