package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My Name is "+this.name);
        System.out.println("My Id is "+this.id);
    }
}

public class Creating_our_Custom_Class_28 {
    public static void main(String[] args) {
        System.out.println("Creating Our Custom Class");

//        Creating an object of Employee class
        Employee emp1 = new Employee(); //Instantiating a new Employee object
        emp1.name = "Saveen Kamboj"; //Setting Properties _ Attributes
        emp1.id = 435;
        emp1.printDetails();
    }
}
