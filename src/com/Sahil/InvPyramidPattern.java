package com.Sahil;
import java.util.*;
public class InvPyramidPattern {
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter height:");
        n= S.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - 1 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
