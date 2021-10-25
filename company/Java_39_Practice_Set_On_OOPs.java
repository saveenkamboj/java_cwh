package com.company;

class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Java_39_Practice_Set_On_OOPs {
    public static void main(String[] args) {
        Employee1 saveen = new Employee1();

        saveen.setName("Lovely Vinayak");

        System.out.println(saveen.getName());

        saveen.salary = 45000;
        System.out.println(saveen.getSalary());


    }
}
