package com.Sahil;
import java.util.*;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int r,c;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        r=S.nextInt();
        c=S.nextInt();
        int arr[][] =new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter arr["+i+"]["+j+"]: ");
                arr[i][j] = S.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
