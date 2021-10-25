package com.company;

public class Java_34_Recursion {
//  factorial(n) = n* n-1 * n-2 * ...1
//  factorial(n) = n * factorial(n-1)
    static int factorial(int n){
        if (n == 0 || n ==1){  //Base Condition
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n == 0 || n ==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i = 1; i<= n; i++){ //1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("Recursion in Java");
        System.out.println("The value of 5 is "+ factorial(5));
        System.out.println("The value of 5 is using iterativly "+ factorial_iterative(5));
    }
}
/*
Recursion:
A function in Java Can call itself.
 */
