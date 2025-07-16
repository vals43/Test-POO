package com.monorganisation.monprojet;

import java.util.Arrays;

public class Grid {

     static char[][] initGrid(int size, int Junk){
        char[][] matrice = new char[size][size];
         for (int i = 0; i < size; i++) {
             Arrays.fill(matrice[i], '.');
         }
         for (int i = 0; i < Junk; i++) {
             int X = (int)(Math.random() * size);
             int Y = (int)(Math.random() * size);
             matrice[X][Y] = 'J';
         }
        return matrice;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(initGrid(5, 5)));
    }




}