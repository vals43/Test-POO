package com.monorganisation.monprojet;

import java.util.Scanner;

public class Game {
    private static final int MAX_MOVES = 20;
    private int movesUsed = 0;
    int score;

    private final Grid grid;
    private final SpaceShip ship;
    private final Scanner scanner;

    public Game(int size, int junk) {
        grid = new Grid(size, junk);
        ship = new SpaceShip();
        this.score= 0;
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        while (movesUsed < MAX_MOVES) {
            displayGameState();
            String direction = getUserInput();
            processMove(direction);
            movesUsed++;
        }

        System.out.println("Game Over");
        System.out.println("Score: " + score);
        scanner.close();
    }

    private void displayGameState() {
        grid.updateSpaceShipPosition(ship);
        System.out.println(grid);
        System.out.println("Your score: " + score);
        System.out.println("Moves left: " + (MAX_MOVES - movesUsed));
    }

    private String getUserInput() {
        String input;
        while (true) {
            System.out.print("Move (U/D/L/R): ");
            input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("[UDLR]")) {
                return input;
            }
        }
    }

    private void processMove(String direction) {
        int newX = ship.getX();
        int newY = ship.getY();

        if (direction.equals("U")) newX--;
        if (direction.equals("D")) newX++;
        if (direction.equals("L")) newY--;
        if (direction.equals("R")) newY++;

        if (grid.isInsideGrid(newX, newY)) {
            ship.setX(newX - ship.getX());
            ship.setY(newY - ship.getY());

            if (grid.isJunkAt(newX, newY)) {
                grid.removeJunk(newX, newY);
                score++;
            }
        } else {
            System.out.println("Invalid move");
        }
    }

    public static void main(String[] args) {
        Game game = new Game(5, 5);
        game.playGame();
    }
}
