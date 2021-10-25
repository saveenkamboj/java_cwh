package com.company;

class MyEmployee{
    private int id;
    private String name;

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

public class AcessModifer_Getter_Setter_40 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 43; This will through error due to private access Moffier
//        harry.name = "Code With Harry"; Throw Error

//        Private uses setter for proper functionality

        harry.setName("Code With Harry");
        harry.setId(4858);

        System.out.println(harry.getName());


    }
}
