package com.company;

public class Java_Loops_Practice_Set {
    public static void main(String[] args) {
//        Problem 1:
        /*
        for(int i = 4 ; i!= 0 ; i--){
            for (int j = 0 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */

//        Problem 2: Write a program to sum first n even numbers using while loop
//        int sum = 0;
//        int n = 4;
//        for (int i = 0; i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.println("Sum of Even Number is: "+sum);

//        Problem 3:
        /*
        int num = 3;
        for(int i = 10 ; i>= 1; i--){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
         */

//        Problem 4: Write a program to find factorial of a given number using the loop
        int fact = 1;
        for(int i = 1 ; i <= 5; i++ ){
            fact *= i;
            System.out.println("The value of fact is "+fact );
        }
        System.out.println(fact);


    }
}
