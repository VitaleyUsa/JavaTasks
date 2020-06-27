package com.javarush.task.task13.task1328;

/* 
Битва роботов
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        AbstractRobot.doMove(amigo, enemy);
        AbstractRobot.doMove(amigo, enemy);
        AbstractRobot.doMove(enemy, amigo);
        AbstractRobot.doMove(amigo, enemy);
        AbstractRobot.doMove(enemy, amigo);
        AbstractRobot.doMove(amigo, enemy);
        AbstractRobot.doMove(enemy, amigo);
        AbstractRobot.doMove(amigo, enemy);
    }




}
