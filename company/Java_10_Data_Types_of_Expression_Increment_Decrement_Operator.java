package com.company;

public class Java_10_Data_Types_of_Expression_Increment_Decrement_Operator {
    public static void main(String[] args) {
//        byte  x = 5;
//        int y = 6;
//        short z = 8;
//
//        int a = y + z;
//        float b = 34.3f + 34;
//
//        System.out.println(b);

//        Increment and Decrement Operator
        int i = 34;
        int b = i++; //First b is assigned i (34) then i is incremented
        System.out.println(b);  //Here value is not incremented

        int j = 67;
        int c = ++j;  // First j is incremented then c is assigned j(68)
        System.out.println(j);


    }
}
