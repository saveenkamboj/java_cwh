package com.company;
public class Java_19_Loops {
    public static void main(String[] args) {
        System.out.println("While Loop in JAVA");
//        Syntax of While Loop
        int i = 1;
        while (i < 10){
            System.out.println(i);
            i++;
        }

//        Do While Loop
        System.out.println("Do while Loop");
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while (a<=10);

//    For Loop in Java
        System.out.println("For Loop in Java");
        for(int j = 0; j<= 10; j++){
            System.out.println(j);
        }

//        Another way Syntax of For Loop
        System.out.println("Another type of For Loop");
        int b = 1;
        for(;b<=10;){
            System.out.println(b);
            b++;
        }

//        HDSC Question
        int sum = 0;
        for(int m = 1 ; m <= 20 ; m++){
          if(m % 2 == 0) {
              sum = sum + m;
          }
        }
        System.out.println("The Value of Sum is "+sum);


    }
}
