package com.company;

class MyMainEmployee{
    private int id;
    private String name;

//    Constructor
    public MyMainEmployee(String name,int id){
        this.id = id;
        this.name = name;
    }

//    Constructor Overloading
    public MyMainEmployee(String name){
        this.name = name;
    }

    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}

public class Constructor_42 {

    public static void main(String[] args) {
//        MyMainEmployee emp1 = new MyMainEmployee();
//        emp1.setName("Ravi Bishnoi");
//        emp1.setId(3444);


        MyMainEmployee emp2 = new MyMainEmployee("Vikas Sahu",5800);

        System.out.println(emp2.getName());
        System.out.println(emp2.getId());
        ;

    }
}
