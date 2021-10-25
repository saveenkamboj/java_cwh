package com.company;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Practice_Set_Chapter1_07 {
    public static void main(String[] args) {

//        Question 1 : Sum
        int a = 5;
        int b = 6;
        int c = 7;
        int sum = a + b + c;
        System.out.println(sum);

//        Question 2 : Calculate CGPA
//        float sub1 = 45;
//        float sub2 = 95;
//        float sub3 = 48;
//        float cgpa = (sub1 + sub2 + sub3)/30;
        int sub1 = 45;
        int sub2 = 95;
        int sub3 = 48;
        float cgpa = (sub1 + sub2 + sub3)/30.0f;
        System.out.println(cgpa);

//        Question 3
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name : ");
        String name = sc.next();
        System.out.printf("Hello %s have a Good day!!!\n",name);
        System.out.println("Hello " + name + " have a good day!!!");

//        Question 4 : Km to miles
        float km_to_miles = 0.621371f;
        System.out.print("Enter the No of Km : ");
        float userInput = sc.nextFloat();
        System.out.printf("Conversion of %.2fKm to miles is : %.2fMile\n",userInput,userInput*km_to_miles);

//        Question 5: Detecting whether no is integer of not
        System.out.print("Enter the Number to check= ");
        boolean number = sc.hasNextInt();
        System.out.printf("Number is int : %b",number);

    }
}
