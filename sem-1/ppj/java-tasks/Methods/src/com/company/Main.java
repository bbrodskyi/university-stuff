package com.company;

public class Main {

    public static void main (String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);

        displayHighScorePosition("Bohdan", 23);
        int score1 = calculateHighScorePosition(1000);
        int score2 = calculateHighScorePosition(500);
        int score3 = calculateHighScorePosition(100);
        int score4 = calculateHighScorePosition(50);
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        System.out.println(score4);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                    + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }


}