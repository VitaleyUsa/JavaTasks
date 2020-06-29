package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge{
    final private int count = 40;
    @Override
    public int getCarsCount() {
        return count;
    }
}
