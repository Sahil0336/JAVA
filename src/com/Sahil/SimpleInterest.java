package com.Sahil;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        float p,r,t,si;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the values of InitialBalance, Rate of interest and Duration: ");
        p =S.nextFloat();
        r =S.nextFloat();
        t= S.nextFloat();
        si = p*r*t/100;
        System.out.println("Simple interest is: "+si);
    }

}
