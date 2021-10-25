package com.company;
import java.util.Scanner;

public class Java_5_Getting_user_input {
    public static void main(String[] args) { System.out.println("Getting Input From User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number = ");
        int a = sc.nextInt();
//        float a = sc.nextFloat();

        System.out.println("Enter the Second Number = ");
        int b = sc.nextInt();
//        float b = sc.nextFloat();

        int sum = a+b;
//        float sum = a+b;
        System.out.println("The sum = "+sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}
