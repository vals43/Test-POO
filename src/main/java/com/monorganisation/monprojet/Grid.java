package com.monorganisation.monprojet;

import java.util.Arrays;

public class Grid {
    char[][] array;
     Grid(int size, int Junk){
        char[][] matrice = new char[size][size];
         for (int i = 0; i < size; i++) {
             Arrays.fill(matrice[i], '.');
         }
         for (int i = 0; i < Junk; i++) {
             int X = (int)(Math.random() * size-1);
             int Y = (int)(Math.random() * size-1);
             matrice[X+1][Y+1] = 'J';
         }
         this.array = matrice;
    }

    @Override
    public String toString(){
        String res = "";
        int i = 0, j = 0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                res+=((array[i][j]));
            }
            res+= "\n";
        }
        return res;
    }

    public static void main(String[] args) {
         Grid test = new Grid(5,5);
        System.out.println(test.toString());
    }


}