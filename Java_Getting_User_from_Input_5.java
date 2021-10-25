package com.company;
import java.util.Scanner;

public class Java_Getting_User_from_Input_5 {
    public static void main(String[] args) {
        System.out.println("Getting Input from User");

//    Firstly Creating a new Scanner Object/Instance
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("The Sum is "+ sum);

//        To check the validity whether it is int or not
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//        String
//        Take only first word
//        String str = sc.next();
//        System.out.println(str);

//        Take full length of string
        String str1 = sc.nextLine();
        System.out.println(str1);
        System.out.println("The value of str1 is "+str1);
    }

}
