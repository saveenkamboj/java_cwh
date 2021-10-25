package com.company;

import org.w3c.dom.ls.LSOutput;

public class Java_33_Variable_Arguments {
    /*
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c ){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d ){
        return a+b+c+d;
    }
    */

    static int sum(int ...arr){
//       arr Availale as int [] arr;
//        ...arr is like a Array
        int result = 0;
        for(int a: arr){
//            System.out.println("The value of Result inside for loop is "+result);
//            System.out.println("The value of a is "+a);
            result += a;
        }
//        System.out.println("The value of result is "+result);
        return result;
    }

//    static int sum(int x, int ...arr){  //int x is compulsory argument
//        int result = 0;
//        for(int a: arr){
//            result += a;
//        }
//        return result;
//    }




    public static void main(String[] args) {
        System.out.println("Welcome to Variable Argument Tutorial");
        /*
        System.out.println("The sum of 4 and 6 is "+ sum(4,6));
        System.out.println("The sum of 4 ,6 ,3 is "+ sum(4,6, 3));
        System.out.println("The sum of 4 ,6 ,3, 5 is "+ sum(4,6, 3, 5));
         */
//        System.out.println(sum());  //No argument
        System.out.println("The sum of 4 and 6 is "+ sum(4,6));
        System.out.println("The sum of 4 ,6 ,3 is "+ sum(4,6, 3));
        System.out.println("The sum of 4 ,6 ,3, 5 is "+ sum(4,6, 3, 5));
        System.out.println("This is Chaudhary Saveen Computer of AMD Ryzen 3 3200G");
    }

}
