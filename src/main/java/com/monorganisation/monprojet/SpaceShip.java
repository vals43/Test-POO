package com.monorganisation.monprojet;

public class SpaceShip {
    private int x;
    private int y;

    public SpaceShip() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public boolean moveX(int dx, int gridSize) {
        int newX = x + dx;
        if (newX >= 0 && newX < gridSize) {
            x = newX;
            return true;
        } else {
            return false;
        }
    }

    public int getY() {
        return y;
    }

    public boolean moveY(int dy, int gridSize) {
        int newY = y + dy;
        if (newY >= 0 && newY < gridSize) {
            y = newY;
            return true;
        } else {
            return false;
        }
    }
}
