package com.monorganisation.monprojet;

import java.util.Scanner;

public class Game {
    private static SpaceShip spaceShip;

    public void move() {
        int i = 0;
        while (i < 20) {
            Scanner move = new Scanner(System.in);
            System.out.println("Enter move (U/D/L/R): ");
            String yourMove = move.nextLine();

            switch (yourMove) {
                case "U":
                    spaceShip.setY(1);
                    i++;
                    break;
                case "D":
                    spaceShip.setY(-1);
                    i++;
                    break;
                case "L":
                    spaceShip.setX(-1);
                    i++;
                    break;
                case "R":
                    spaceShip.setX(1);
                    i++;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid move, please try again");
            }
        }
    }

    public static void main(String[] args) {

    }

}
