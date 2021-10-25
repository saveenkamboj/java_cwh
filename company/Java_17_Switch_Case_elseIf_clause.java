package com.company;
import java.util.Scanner;


public class Java_17_Switch_Case_elseIf_clause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age = ");
        int age = sc.nextInt();
        /*
        if(age>56){
            System.out.println("You are Experienced!");
        }
        else if(age>45){
            System.out.println("You are semi-Experienced");
        }
        else{
            System.out.println("You are not Experienced");
        }
         */

//        Switch Case Statement - Modern Way
        switch (age) {
            case 18 -> System.out.println("You are going to be adult");
            case 24 -> System.out.println("You are going to Job Early");
            case 60 -> System.out.println("You are older enjoy your life");
            default -> System.out.println("You are a Lucky Person");
        }
    }
}
