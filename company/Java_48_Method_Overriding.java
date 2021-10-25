package com.company;

class A{
    public int method1(){
        return  34;
    }
    public void method2(){
        System.out.println("I am method 2 of Class A");
    }
}

//Inheritance
class B extends A{
    public void method3(){
        System.out.println("I am method 3 of Class B");
    }

//    Method Overriding
    @Override //Optional/Recommended  --> Good Practice
    public void method2(){
        System.out.println("I am method 2 of Class B");
    }
}

public class Java_48_Method_Overriding {
    public static void main(String[] args) {
//        System.out.println("Method Overriding");
        A a1 = new A();
//        a1.method2();

        B b1 = new B();
        b1.method2();
    }
}

/*
Method Overriding
If the child class Implemented the some method present in the parent class again, it is known as method overiding.

When an object of subclass is created and the overriding method is class, the mmethod which has been implemented in the subclass is called & its code is executed
 */
