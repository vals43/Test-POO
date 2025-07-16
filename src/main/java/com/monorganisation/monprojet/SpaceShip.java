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

    public void setX(int x) {
        this.x += x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y += y;
    }

}
