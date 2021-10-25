package com.company;

class Base{
    int x;

    public void printMe() {
        System.out.println("I am a constructor of Base");
    }

    public void setX(int x) {
        System.out.println("I m in base Setting X now");
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends Base{
    public int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Inheritance_in_Java_45 {
    public static void main(String[] args) {
//        System.out.println("Inheritance in Java");

//        Creating a object in Base Class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());


//        Creating a object of Derived Class
        Derived d = new Derived();
        d.setX(53);
        System.out.println(d.getX());

//        WE cannot access y from base class

        


    }
}
