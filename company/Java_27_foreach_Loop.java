package com.company;

public class Java_27_foreach_Loop {
    public static void main(String[] args) {
        int [] marks = {34,45,56,45};
        float [] scienceMarks = {34.4f, 55.43f, 67.2f};
        String [] studentName = {"Rohan", "Aman", "Karan" , "Vikas", "Mohit"};

//        Know the length of Array
        System.out.println("Length of Array");
        System.out.println(marks.length);
        System.out.println(scienceMarks.length);
        System.out.println(studentName.length);

//        Display the Array (Naive Way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);

//        Using For Loop
        System.out.println("For Loop");
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

//        For each Loop
        System.out.println("Using For Each Loop");
        for (int mark : marks) {
            System.out.println(mark);
        }
        for(String student : studentName){
            System.out.println(student);
        }
    }
}
