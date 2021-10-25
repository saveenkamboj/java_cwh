package com.company;


public class Variable_Argument_33 {

//    Optional Argument
    public static int sum(int ...arr){
//        Here arr available is array object
        int result = 0;
        for(int ele : arr){
            result += ele;
        }
        return result;
    }

//    One compulsory and optional argument
public static int sum1(int a ,int ...arr){
//        Here arr available is array object
    int result = 0;
    for(int ele : arr){
        result += ele;
    }
    return result;
}


    public static void multiply(int ...arr){
        for(int ele : arr){
            for(int i = 1 ; i <= 10 ; i++){
                System.out.printf("%d X %d = %d\n", ele,i,ele*i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Variable Arguments");

        System.out.println("The Sum is : "+sum(4,5,46));
        System.out.println("Sum of nothing is :"+sum());
//        multiply(4,6);
    }
}
