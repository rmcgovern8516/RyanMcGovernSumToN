package com.company;
import java.util.Scanner;

public class RyanMcGovernLib {
    public static void sumUpTo (){
        System.out.println("Enter a number.");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int out = 0;
        int i=1;
        while (i<=n){
            out+=i;
            i++;
        }
        String end = "The sum from 1 to "+n+" is: "+out;
        System.out.println(end);
        System.out.print("Go again if you want. ");
        sumUpTo();
    }
}
