package com.Sahil;
import java.util.*;
public class FirstSwitchCase {
    public static void main(String[] args) {
        int choice;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        choice=S.nextInt();
        switch (choice){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("Default case");
        }
    }

}
