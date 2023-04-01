package com.Sahil;
import java.util.*;
public class SeasonSwitch {
    public static void main(String[] args) {
        int choice;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice = S.nextInt();
        switch(choice){
            case 1:
            case 2:
            case 12:
                System.out.println("month is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("month is Spring");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("month is Autumn");
                break;
            default:
                System.out.println("Default case");
        }
    }
}
//multiple switch case