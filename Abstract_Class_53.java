package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
//We cannot create object/Instance of abstract class

class Child2 extends Parent2{
    @Override
    public void greet(){  //Compulsory to defining
        System.out.println("Say Hello to Everyone, Good Morning");
    }
    @Override
    public void greet2(){  //Compulsory to defining
        System.out.println("Good Afternoon");
    }
}

abstract class child3 extends Parent2{  //Standard to Standard
    public void th(){
        System.out.println("I am good");
    }

}

public class Abstract_Class_53 {
    public static void main(String[] args) {
        Child2 ch = new Child2();

//        Parent2 p = new Parent2(); ERROR because it is abstract

    }
}

/*
What is Abstract? - Khyali Pulav
Existing in thought or as an idea without concrete existence

Abstract Method (JAVA)?
A method that is declared without any implementation
abstract void moveTo(double x, double y);

Abstract Class
If class includes abstract methods, then the class itself must be declared abstract as in.


 */
