package com.company;

//this Keyword --> Good Practice
//This is a way for us to reference an object of the class which is being created/reference

class ekClass{
//    ekClass(){}  // Default Constructor
    ekClass(int v){
        System.out.println("I am a Constructor of ekClass");
        this.a = v;
    }
    /*
    ekClass(int a){
        this.a = a;
    }
     */
    public int a;
    public int returnOne(){
        return 1;
    }

//    Getter
    public int getA() {
        return a;
    }
}

class doClass extends ekClass{
    doClass(int c){
        super(c);
        System.out.println("I am a Constructor of doClass");
    }
}

//super Keyword
/*
A reference variable used to refer immediat parent class object
    1. Can be used to invoke parent class methods.
    2. Can be used to invoke parent class Constructor
    3. Can be used to refer parent class instance variable.
 */

public class Java_47_this_super_keyword {
    public static void main(String[] args) {

//        For this Keyword
//        ekClass ek = new ekClass(36);
//        System.out.println(ek.getA());

//        For super Keyword
        doClass do1 = new doClass(97);


    }
}
