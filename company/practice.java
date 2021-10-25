package com.company;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second ;
        System.out.println("Enter the First Number = ");
        first = sc.nextInt();
        System.out.println("Enter the Second Number = ");
        second = sc.nextInt();
        System.out.println("The Sum is "+(first+second));
        System.out.printf("The Sum is : %d", first+second);
    }
}
