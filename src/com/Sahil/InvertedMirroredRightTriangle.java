package com.Sahil;
import java.util.*;
public class InvertedMirroredRightTriangle {
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter height: ");
        n=S.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
