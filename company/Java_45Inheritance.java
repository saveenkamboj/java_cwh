package com.company;

class Base{
    int x;

    public void printMe(){
        System.out.println("I am a Constuctor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X now");
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and setting Y now");
        this.y = y;
    }
}

public class Java_45Inheritance {
    public static void main(String[] args) {
//        Inheirtance In Java Language

//        Creating a Object of Base Class
        Base b = new Base();
        b.setX(43);
        System.out.println(b.getX());

//        Creating an Object of Derived Class
        Derived d = new Derived();
        d.setX(23);
        d.setY(67);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}

