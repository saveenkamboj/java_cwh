package com.company;
import java.util.Scanner;

//import static java.lang.System.in;

public class java_16_Codidtional_if_else {
    public static void main(String[] args) {
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt(); //Here = is assign operator
        }
        if (age>18){
            System.out.println("Yes Boy You can Drive");
        }
        else{
            System.out.println("You cannot Drive");
        }

    }
}
