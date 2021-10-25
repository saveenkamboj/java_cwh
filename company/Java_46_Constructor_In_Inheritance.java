package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Constructor of Base Class");
    }
    Base1(int a){
        System.out.println("I am overloaded constructor");
        System.out.println("The Value of A is :"+ a);
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(84);
        System.out.println("I am Derived Class Constructor");
    }
    Derived1(int x, int y){
//        super(x);  //here x = 23 ; ie x = a //This called the overloaded constructor
        System.out.println("I am in derived overloded");
        System.out.println("The value of x is :"+x);
        System.out.println("The value of y is :"+y);
    }
}

class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("I am child of Derived Construtor");
    }
    ChildDerived(int x, int y, int z){
        super(x,y); //This calls the overloaded constructor with x,y
        System.out.println("I am overloaded Constructor with value of z as :"+z);
    }
}
public class Java_46_Constructor_In_Inheritance {
    public static void main(String[] args) {
//        System.out.println("Constructor in Inheritance");

//        Base1 b = new Base1();  //Object of Base1 class
//        Derived1 d = new Derived1(); //Object of Derived1 class
//        Derived1 d1 = new Derived1(23,3);

//        When a Derived class is extended from the Base class the constructor of the Base class is executed first followed by the constructor of the derived class

        ChildDerived cd = new ChildDerived();
        ChildDerived cd1 = new ChildDerived(34,454,23);

    }
}
