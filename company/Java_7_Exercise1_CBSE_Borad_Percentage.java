package com.company;
import java.util.Scanner;

public class Java_7_Exercise1_CBSE_Borad_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");

        System.out.println("English = ");
        int english = sc.nextInt();

        System.out.println("Hindi = ");
        int hindi = sc.nextInt();

        System.out.println("Maths = ");
        int maths = sc.nextInt();

        System.out.println("Science = ");
        int science = sc.nextInt();

        System.out.println("Computer = ");
        int computer = sc.nextInt();

        int total = english+hindi+maths+science+computer;
        System.out.println("Total Marks is = "+total);

        int percentage = total/5;
        System.out.println("Percentage is = "+percentage);
    }
}
