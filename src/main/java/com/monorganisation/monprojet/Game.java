package com.monorganisation.monprojet;

import java.util.Scanner;

public class Game {
    private static SpaceShip spaceShip;
    private static Grid grid;

    public void move() {
        Scanner scanner = new Scanner(System.in);
        int moves = 0;
        int gridSize = 6;

        while (moves < 20) {
            grid.updateGrid(spaceShip);
            grid.displayGrid(moves);

            if (grid.allStonesCollected()) {
                System.out.println("Congratulations! You collected all stones in " + moves + " moves!");
                return;
            }

            System.out.print("Enter move (U/D/L/R): ");
            String yourMove = scanner.nextLine().toUpperCase();
            boolean moved = false;

            switch (yourMove) {
                case "U":
                    moved = spaceShip.moveY(-1, gridSize);
                    break;
                case "D":
                    moved = spaceShip.moveY(1, gridSize);
                    break;
                case "L":
                    moved = spaceShip.moveX(-1, gridSize);
                    break;
                case "R":
                    moved = spaceShip.moveX(1, gridSize);
                    break;
                default:
                    System.out.println("Invalid move, please enter U, D, L, or R.");
                    continue; // redemande sans consommer le move
            }

            if (moved) {
                moves++;
            } else {
                System.out.println("Movement impossible! You hit the border of the grid. Try another direction.");
            }
        }

        grid.updateGrid(spaceShip);
        grid.displayGrid(moves);
        if (grid.allStonesCollected()) {
            System.out.println("Congratulations! You collected all stones in " + moves + " moves!");
        } else {
            System.out.println("Game Over! You did not collect all stones in 20 moves.");
        }
    }

    public static void main(String[] args) {
        spaceShip = new SpaceShip();
        grid = new Grid(6);
        Game game = new Game();
        game.move();
    }
}
