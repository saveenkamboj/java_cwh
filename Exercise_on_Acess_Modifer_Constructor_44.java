package com.company;


class Cylinder{
    private int radius;
    private int height;
    private final double PI = Math.PI;

    public Cylinder(int r,int h){
        this.height = h;
        this.radius = r;
    }

//    Setter
    public void setRadius(int r){
        this.radius = r;
    }
    public void setHeight(int h){
        this.height = h;
    }

//    Getter
    public int getRadius(){
        return this.radius;
    }
    public int getHeight(){
        return this.height;
    }

//    Volume of Cylinder
    public double volume(){
        return PI*this.radius*this.radius*this.height;
    }

//    Surface Area of Cylinder
    public double surfaceArea(){
        return 2*PI*this.radius*this.height+2*PI*this.radius*this.radius;
    }
}

class Rectangle1{
    private int length;
    private int breath;

   public Rectangle1(){
       this.length = 4;
       this.breath = 5;
   }

//   Overload a constructor : custom parameter
   public Rectangle1(int len, int bre){
       this.length = len;
       this.breath = bre;
   }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}

public class Exercise_on_Acess_Modifer_Constructor_44 {
    public static void main(String[] args) {
//        System.out.println("Exercise on Access Modifier / Constructor");

        /*
//        Problem 1: Using Getter and setter
        Cylinder obj1 = new Cylinder(); //class object / instance
        obj1.setRadius(9);
        obj1.setHeight(12);

        System.out.println(obj1.getRadius());
        System.out.println(obj1.getHeight());

        System.out.format("Surface Area is :%.2f\n",obj1.surfaceArea());
        System.out.format("Volume is :%.2f\n",obj1.volume());

//        Problem 2: Using Constructor
        Cylinder obj2 = new Cylinder(9,12);
        System.out.format("Volume is :%.2f\n",obj2.volume());
         */

//        Problem 3: Overload Constructor
        Rectangle1 rec = new Rectangle1(10,53);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreath());

    }
}
