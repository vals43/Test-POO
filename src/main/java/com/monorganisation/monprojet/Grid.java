package com.monorganisation.monprojet;

import java.util.Random;

public class Grid {
    private char[][] grid;
    private int size;
    private int score;
    private int totalStones;

    public Grid(int size) {
        this.size = size;
        this.grid = new char[size][size];
        this.score = 0;
        placeStones();
    }

    private void placeStones() {
        Random rand = new Random();
        totalStones = size;
        for (int i = 0; i < totalStones; i++) {
            int x, y;
            do {
                x = rand.nextInt(size);
                y = rand.nextInt(size);
            } while ((x == 0 && y == 0) || grid[y][x] == 'J');
            grid[y][x] = 'J';
        }
    }

    public void updateGrid(SpaceShip s) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] != 'J') {
                    grid[i][j] = '.';
                }
            }
        }
        if (grid[s.getY()][s.getX()] == 'J') {
            score++;
            totalStones--;
        }
        grid[s.getY()][s.getX()] = 'S';
    }

    public void displayGrid(int moves) {
        System.out.println("\nCurrent Grid:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Moves: " + moves + "/20, Score: " + score);
    }

    public boolean allStonesCollected() {
        return totalStones == 0;
    }

    public int getScore() {
        return score;
    }
}
