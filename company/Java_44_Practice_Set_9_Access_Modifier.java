package com.company;


class Cylinder{
    private int radius;
    private int height;

//    Creating a Constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    /*
//    Getter and Setter
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    */

    public double surfaceAread(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public  double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    private final int length;
    private final int breath;

    public Rectangle(){
        this.length = 4;
        this.breath = 5;
    }

    public Rectangle(int i, int j) {
        this.length = i;
        this.breath = j;
    }
//    public void print(){
//        System.out.println("The Value of Length is "+ length);
//        System.out.println("The Value of Breath is "+ breath);
//    }
    public void printDetails(){
        System.out.println("My Length is "+length);
        System.out.println("My Breath is "+ breath);
    }
}

public class Java_44_Practice_Set_9_Access_Modifier {
    public static void main(String[] args) {
//        Problem 1: Using Setter and Getter

        Cylinder myCylinder = new Cylinder(5,3);

//        Using Getter and Setter
//        myCylinder.setHeight(12);
//        System.out.println("The Height is "+myCylinder.getHeight());
//        myCylinder.setRadius(9);
//        System.out.println("The Radius is "+myCylinder.getRadius());


//        Problem 2: Find out the Volume and Surface Area
        System.out.println("The Surface Area is = "+myCylinder.surfaceAread());
        System.out.println("The Volume is = "+myCylinder.volume());


//        Problem 3: Constructor Overloading
        Rectangle rec1 = new Rectangle();
        rec1.printDetails();
        Rectangle rec2 = new Rectangle(42,35);
        rec2.printDetails();
    }
}
