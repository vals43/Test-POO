package com.monorganisation.monprojet;

import java.util.Arrays;

public class Grid {
    private char[][] array;
    private int size;

    public Grid(int size, int junk) {
        this.size = size;
        array = new char[size][size];

        for (int i = 0; i < size; i++) {
            Arrays.fill(array[i], '.');
        }

        int placed = 0;
        while (placed < junk) {
            int x = (int)(Math.random() * size);
            int y = (int)(Math.random() * size);
            if (array[x][y] == '.') {
                array[x][y] = 'J';
                placed++;
            }
        }
    }

    public void updateSpaceShipPosition(SpaceShip ship) {
        clearSpaceShip();
        array[ship.getX()][ship.getY()] = 'S';
    }

    private void clearSpaceShip() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] == 'S') {
                    array[i][j] = '.';
                }
            }
        }
    }

    public boolean isJunkAt(int x, int y) {
        return array[x][y] == 'J';
    }

    public void removeJunk(int x, int y) {
        if (array[x][y] == 'J') {
            array[x][y] = '.';
        }
    }

    public boolean isInsideGrid(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : array) {
            for (char c : row) {
                sb.append(c);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
