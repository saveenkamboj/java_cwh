package com.company;
import java.util.Random;
import java.util.Scanner;

class Game {
    private int userNum;
    private int randNumber;

    public Game() {
        // create instance of Random class
        Random rand = new Random();

        randNumber = rand.nextInt(100);
        System.out.println(randNumber);
        gamaAlgo();
    }

    public int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        userNum = sc.nextInt();
        return userNum;
    }

    public void gamaAlgo() {
        int noOfguesses = 1;
        while (userNum != randNumber) {
            userInput();
            if(userNum < randNumber) {
                System.out.println("Please Increase the Number!");
            } else if(userNum > randNumber) {
                System.out.println("Please Decrease the Number!");
            } else if(userNum == randNumber) {
                System.out.println("You guess the Correct Number" + randNumber);
                System.out.println("You take " + noOfguesses + " counts");
            }
            noOfguesses++;
            if(userNum == randNumber) {
                break;
            }
        }


    }
}

