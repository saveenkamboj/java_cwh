package com.company;

public class Array_Function_For_each_Loop {
    public static void main(String[] args) {
        int [] marks = {34,54,23,53};
        float [] floatMarks = {34.4f, 45.3f, 84.3f};
    String [] students = {"Harry", "Rohan", "Shubham","Abraham"};

//        Length
        System.out.println("The Length of marks array is : "+marks.length);

//        Displaying the Array (Naive Way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

//        Displaying Using For Loop
        System.out.println("____Using For Loop____");
        for (int i = 0 ; i < marks.length ; i++){
            System.out.println(marks[i]);
        }

//        Displaying the Array in Reverse Order
        System.out.println("______Displying in Reverse Order________");
        for (int i = marks.length - 1 ; i >= 0 ; i--){
            System.out.println(marks[i]);
        }

//        Displaying Using For Each Loop
        System.out.println("_____Using For Each Loop____");
        for (int mark : marks){
            System.out.println(mark);
        }

    }
}
