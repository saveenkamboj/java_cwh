package com.company;
import java.util.Scanner;

public class Java_11_Practice_Set_2 {
    public static void main(String[] args) {
//        float a = 7/4 * 9/2;
        float a = 7f/4f * 9f/2f;
        System.out.println(a);

//        Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println("After the Encryption "+grade);

//        Decrypting the grade
        grade = (char)(grade-8);
        System.out.println("Before the Decrypting "+grade);

//        Use Comparison operator to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int num = sc.nextInt();
        System.out.println(num>8); //Return True of False

        int thisiswhat = 34;



    }
}
