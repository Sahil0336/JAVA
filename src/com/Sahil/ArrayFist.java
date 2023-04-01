package com.Sahil;
import java.util.*;
public class ArrayFist {
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        n=S.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " +i+": ");
            arr[i]=S.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("The values of arr["+i+"] are: "+arr[i]);
        }
    }
}
