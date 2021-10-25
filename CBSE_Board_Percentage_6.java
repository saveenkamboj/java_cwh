package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CBSE_Board_Percentage_6 {
    public static void main(String[] args) {
//        CBSE Board Percentage

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Maximum Marks of paper : ");
        int maxMarks = sc.nextInt();

        System.out.print("Enter 1st Subject Marks : ");
        float marks1 = sc.nextFloat();

        System.out.print("Enter 2nd Subject Marks : ");
        float marks2 = sc.nextFloat();

        System.out.print("Enter 3rd Subject Marks : ");
        float marks3 = sc.nextFloat();

        System.out.print("Enter 4th Subject Marks : ");
        float marks4 = sc.nextFloat();

        System.out.print("Enter 5th Subject Marks : ");
        float marks5 = sc.nextFloat();

        float percentage = ((marks1 + marks2 + marks3 + marks4 + marks5)/(5*maxMarks))*maxMarks;

        System.out.printf("The Percentage is : %.1f%% ",percentage);

    }
}
