package com.company;

public class Recusion_34 {
    public static int factorial(int n){
//        factorial(n) = n * n-1 * ...1

        if(n == 1 || n == 0){
            System.out.println("This will calling here!!!!!!!!!-----------------------------------");
            System.out.printf("Value is %d X %d = %d\n",n ,n,n*n);
            return 1;
        }
        else{
            System.out.println("Value of n is "+n);
            final int fact = n * factorial(n-1);
            System.out.println("Value of fact is "+fact);
            return fact;
        }
//        fact = 5 * factorial(4)
//        fact = 5 * 4 * factorial(3)
//        fact = 5 * 4 * 3 * factorial(2)
//        fact = 5 * 4 * 3 * 2 * factorial(1)
//        fact = 5 * 4 * 3 * 2 * 1
    }

    public static void main(String[] args) {
        System.out.println("Recursion in Java");

        System.out.println("Factorial of 5 is : "+factorial(5));
    }
}
