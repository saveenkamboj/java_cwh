package com.company;

public class Java_26_Introduction_to_array {
    public static void main(String[] args) {
//        Classroom of 500 Students - You have to store marks of this student
//        You have two Variable
//            1. Create 500 Variable
//            2. Use Array(recommended)

        /*
        Array is a collecction of similar types of Data
        In Array we can Accessing it faster
         */

//        Method 1
        int [] sale;  // = Declartion
        sale = new int[5];  //Memory Allocation

//        Method 2
        int [] marks = new int[5]; //Declartion + Memory Location

        int []studentroll = {34, 45,34,65,34};  //Method 3 = Declaration + MemoryAllocation + Initialization together
        marks[0] = 34;
        marks[1] = 67;
        marks[2] = 45;
//        marks[5] = 43; -Throw a Error
//        marks[6] = 34; -Throw a Error
//        System.out.println(marks[2]);




    }
}
