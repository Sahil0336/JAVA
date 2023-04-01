package com.Sahil;
import java.util.*;
public class PatternRightTriangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter tha no. of height: ");
        n = S.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
