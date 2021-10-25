package com.company;

public class Java_31_Method_in_Java {
    static int sum(int a, int b) {   //1 way - using static keyword
        return a+b;
    }


    int subtraction(int a, int b) {  //2 way - making a class object given blow
        return a-b;
    }
    public static void main(String[] args) {
        /*
        Sometimes a program grown in size and we want to seperate the logic of main method to other methods.
        For instance- If we are calculating average of a number pair of 5  times, we can use methods to avoid repeating the logic

        Syntax
        A method is a function written inside a class. Since Java is an Object Oriented language, we need to write the method inside some class

        dataType name(){
            //method body
        }

         */
        int a = 34;
        int b = 45;
        int c = sum(a,b);
        System.out.println(c);

//        Another way of Calling a function
//        Method invocation using object creation
        Java_31_Method_in_Java newObj = new Java_31_Method_in_Java();
        int x = 45;
        int y = 34;
        int z = newObj.subtraction(x,y);

        System.out.println(z);
    }

}
