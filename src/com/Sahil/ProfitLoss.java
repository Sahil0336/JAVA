package com.Sahil;
import java.util.*;
public class ProfitLoss {
    public static void main(String[] args) {
        int cp,sp; Scanner S = new Scanner(System.in);
        System.out.println("Enter the cost price and selling price: ");
        cp =S.nextInt();
        sp= S.nextInt();
        if(sp>cp){
            System.out.println("Profit");
        }
        else if(sp<cp){
            System.out.println("Loss");
        }
        else{
            System.out.println("No profit no loss");
        }
    }
}
