package com.Sahil;
import java.util.*;
public class Addition {
    public static void main(String[] args) {
        float a,b,sum;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        a= S.nextFloat();
        b=S.nextFloat();
        sum=a+b;
        System.out.println("Sum: "+sum);
    }
}
