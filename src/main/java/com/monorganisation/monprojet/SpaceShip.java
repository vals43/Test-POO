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

    public void setX(int a) {
        this.x += a;
    }

    public int getY() {
        return y;
    }

    public void setY(int b) {
        this.y += b;
    }
}
