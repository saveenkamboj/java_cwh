package com.company;
import java.util.Random;
import java.util.Scanner;

public class Java_Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randInstance = new Random();
        System.out.println("Rock , Paper , Scissor Game");
        System.out.println("User Turn");
        System.out.println("Press 1 for Rock");
        System.out.println("Press 2 for Paper");
        System.out.println("Press 3 for Scissor");
        int user = sc.nextInt();
        switch (user) {
            case 1:
                System.out.println("User Choose 1 Rock");
                break;
            case 2:
                System.out.println("User Choose 2 Paper");
                break;
            case 3:
                System.out.println("User Chose 3 Scissor");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + user);
        }

        System.out.println("");
        System.out.println("\nComputer Turns");
        int choice = randInstance.nextInt(3);
        switch (choice) {
            case 0:
                System.out.println("Computer Choose Rock");
                break;
            case 1:
                System.out.println("Computer Choose Paper");
                break;
            case 2:
                System.out.println("Computer Chose Scissor");
                break;
        }
        System.out.println("");
        if(user == 1 && choice == 2) {
            System.out.println("User Win");
        } else if(user == 1 && choice == 1) {
            System.out.println("Computer Win");
        } else if(user == 2 && choice == 0) {
            System.out.println("User Win");
        } else if(user == 2 && choice == 2) {
            System.out.println("Computer Win");
        } else if(user == 3 && choice == 1) {
            System.out.println("User Win");
        } else if(user == 3 && choice == 0) {
            System.out.println("Computer Win");
        }else if(user == 1 && choice == 0){
            System.out.println("Match Draw");
        }else if(user == 2 && choice == 1){
            System.out.println("Match Draw");
        }else if(user == 3 && choice == 2){
            System.out.println("Match Draw");
        }



    }

}