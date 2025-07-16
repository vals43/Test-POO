package com.monorganisation.monprojet;

import java.util.Scanner;

public class Game {
    private static SpaceShip spaceShip;

    public void move() {
        Scanner move = new Scanner(System.in);
        int i = 0;
        while (i < 20) {
            System.out.println("Enter move (U/D/L/R): ");
            String yourMove = move.nextLine();

            switch (yourMove) {
                case "U":
                    spaceShip.setY(spaceShip.getY() + 1);
                    i++;
                    break;
                case "D":
                    spaceShip.setY(spaceShip.getY() - 1);
                    i++;
                    break;
                case "L":
                    spaceShip.setX(spaceShip.getX() - 1);
                    i++;
                    break;
                case "R":
                    spaceShip.setX(spaceShip.getX() + 1);
                    i++;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid move, please try again");
            }
        }
    }

    public static void main(String[] args) {
        spaceShip = new SpaceShip();
        Game game = new Game();
        game.move();
    }

}
