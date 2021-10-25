package com.company;
import java.util.Scanner;

public class Switch_Case_Statement_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        /*
        if(age > 56){
            System.out.println("You are Experience");
        }
        else if(age > 46){
            System.out.println("You are semi-experienced");
        }
        else if(age > 36){
            System.out.println("You are semi-semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
         */

//        Switch Case Statment
        switch (age) {
            case 18 -> {
                System.out.println("You are going to Adult");
                System.out.println("Hello World");
            }
            case 23 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are get to retired");
            default -> System.out.println("Enjoy your life");
        }
    }
}
