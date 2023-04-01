package com.Sahil;
import java.util.*;
public class XstarPattern {
    public static void main(String[] args) {
        int n;
        Scanner S= new Scanner(System.in);
        System.out.println("Enter height: ");
        n=S.nextInt();
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i == j || j == 2*n-i) {
                    if(i<=n){
                        System.out.print(i%2);
                    }
                    else
                        System.out.print((2*n-i)%2);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
