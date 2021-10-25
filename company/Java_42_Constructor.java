package com.company;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        this.name = "Your_Name_Here";
        this.id = 0;
    }
    public MyMainEmployee(String n, int num){ //It runs automatically because it is constructor
        this.name = n;
        this.id = num;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Java_42_Constructor {
    public static void main(String[] args) {
//        MyMainEmployee saveen = new MyMainEmployee();
        MyMainEmployee saveen = new MyMainEmployee("Lovely Kamboj",85);
//        saveen.setName("Saveen Chaudhary");
//        saveen.setId(34);

        System.out.println(saveen.getName());
        System.out.println(saveen.getId());
        System.out.println(saveen.getName());

    }
}
/*
Constructor In Java:
--> A member function used to initalize an object while creating it.

Construcor Overloading:
-->
 */
