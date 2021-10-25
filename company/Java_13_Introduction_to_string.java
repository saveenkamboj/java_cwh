package com.company;
import  java.util.Scanner;

public class Java_13_Introduction_to_string {
    public static void main(String[] args) {

//        Introduction to String
        String name = new String("saveen");
//        aliter
        String name1 = "Kamboj";
//      Printing the Details
        System.out.println(name);
        System.out.println(name1);


        int fhl = 6;
        int a = 34;
        float b = 3.4533f;
//        printf Uses format specifer
        System.out.printf("The value of a is %d and value of b is %f\n", a, b);
        System.out.format("The value of a is %d and value of b is %f\n", a, b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String = ");
        String st = sc.next(); //write upto white space
        System.out.println(st);

    }
}
