package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My Name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Java_38_Creating_Our_Own_Java_Class {
    public static void main(String[] args){
        System.out.println("This is our Custom Class");
        Employee saveen = new Employee();
        Employee john = new Employee();
//        Setting Properties/Attributes for saveen object
        saveen.id = 34;
        saveen.salary = 9000;
        saveen.name = "Lovely Kamboj";

//        Printing the Properties/Attributes
//        System.out.println(saveen.id);
//        System.out.println(saveen.name);
        saveen.printDetails();

        john.id = 74;
        john.salary = 4500;
        john.name = "John Satnam Singh";
        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);
    }
}
/*
Any real world Object  = Properties + Behaviour
Objects in OOPs        = Attributers + Methods


 */
