package com.company;

public class Method_Overloading_32 {

    static int add(int x, int y){
        return x+y;
    }

    static void telJoke(){
        System.out.println("I invented a new world!");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int []arr){
        arr[0] = 98;
    }

//    Function Overloading
    static void func1(){
        System.out.println("Hello World no parameter");
    }
    static void func1(String n){
        System.out.println("Hello World "+ n);
    }
    static void func1(String n, int roll){
        System.out.println("Hello World MR "+n+" Your roll no is "+roll);
    }

    public static void main(String[] args) {
        Method_Overloading_32 obj = new Method_Overloading_32();
        telJoke();



//      Changing the Integer
        int x = 45;
        change(x);
        System.out.println("after running change "+x);

//        Changing the Array : here it provide reference
//        This will apply on objects
//        Here we pass the reference
        int [] marks = {23,45,65,29,75};
        change2(marks);
        System.out.println(marks[0]);

//        Method Overloading
//        Arguments are Actual
        func1();
        func1("Saveen Kamboj");
        func1("Saveen Chaudhary", 35);

    }
}
