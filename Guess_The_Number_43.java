package com.company;
import java.util.Scanner;

class Game{
    int noOfGuesses = 1;
    int userInput = 0;
    int result = 0;
    Scanner sc = new Scanner(System.in);


    public Game(){
        result = 43;
    }

    public void takeUserInput(){
        System.out.print("Enter the Number : ");
        this.userInput = sc.nextInt();
    }
    public void isCorrectNumber(){
        while(true){
            if(this.userInput == this.result){
                System.out.println("Congratulation _________You won the game");
                System.out.println("You take : "+noOfGuesses+" Guesses");
                break;
            }
            else if(this.userInput < this.result){
                System.out.println("!!!!!!!You Guess Low Number");
                noOfGuesses += 1;
            }
            else{
                System.out.println("!!!!!!!You Guess High Number");
                noOfGuesses += 1;
            }
            if(userInput != result  && noOfGuesses >= 5){
                System.out.println("Press 1 for Exit : ");
                System.out.println("Press any Numeric-Key to continue");
                if(sc.nextInt() == 1){
                    System.out.println("Unfortunately you used "+(noOfGuesses-1)+" guesses");
                    break;

                }

            }
            takeUserInput();
        }
    }

}

public class Guess_The_Number_43 {
    public static void main(String[] args) {
        Game player1 = new Game();
        player1.takeUserInput();
        player1.isCorrectNumber();



        /*
        Create a class game,
        which allows a user to play a "Guess the Number"

         */
    }
}
