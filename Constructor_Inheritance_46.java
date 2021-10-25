package com.company;

class Base1{
    public int x;

    public Base1(){
        System.out.println("I am a constructor of Base");
    }
    public Base1(int x){
        System.out.println("I am overloaded constructor of Base with value of x : "+x);
    }
}

class Derived1 extends Base1{
    public int y;

    public Derived1(){
//        super(34);
//        super will run overloaded constructor of Base class

        System.out.println("I am Derived Class Constructor");
    }

    public Derived1(int x, int y){
        super(x);
        System.out.println("I am overloaded constructor of Derived with value of y : "+y);
    }
}

class childDerived extends Derived1{
    public childDerived(){
        System.out.println("I am Child Derived Constructor");
    }
    public childDerived(int x, int y , int z){
        super(x,y);
        System.out.println("I am overloaded constructor of childDerived with value of z : "+z);
    }
}


public class Constructor_Inheritance_46 {
    public static void main(String[] args) {
//        Base1 obj1 = new Base1();

//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(3,75);

//        childDerived cd = new childDerived();
        childDerived cd = new childDerived(45,66,32);




//        When derived class has no constructor it automatically invoke the constructor of super class

//        If Derived class has it own constructor then it will first invoke the constructor of base class/super class and then invoke it own class constructor.

    }
}

