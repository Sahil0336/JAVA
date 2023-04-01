package com.Sahil;
import java.util.*;

public class TwoDimensional {
    public static void main(String[] args) {
        int r = 2;
        int C = 3;
        int[][] array = new int[r][C];
        int value = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < C; j++) {
                array[i][j] = value;
                value++;
            }
        }
        System.out.println("The 2D array is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
