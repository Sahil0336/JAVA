package com.Sahil;

import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the no. of elements= ");
        int n = S.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value= ");
            arr[i]= S.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("The values are: "+arr[i]);
        }
    }
}