package com.company;

class MyEmployee{
    private int id;
    private String name;
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

public class Java_40_Getter_Setter {
    public static void main(String[] args) {
        MyEmployee saveen = new MyEmployee();
//        saveen.name = "Saveen Kamboj"; --Throw an error due to private access modifer
        saveen.setName("Saveen");
        System.out.println(saveen.getName());

        saveen.setId(34);
        System.out.println(saveen.getId());

    }
}
/*
Access Modifier:
--> Specifier where a property/method is accessible .
There are four types of access modifier in Java:
    1. Private
    2. Public
    3. Default
    4. Protected
 */
