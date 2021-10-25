package com.company;

class Phone{
    public void showTime(){
        System.out.println("Show Time");
    }
    public void on(){
        System.out.println("Turning on Phone ");
    }
}
class Smartphone extends Phone{

    public void music(){
        System.out.println("Playing Music");
    }

    @Override
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}

public class Dynamic_Method_Dispatch_49 {
    public static void main(String[] args) {
//        Phone obj = new Phone(); //POSSIBLE
//        obj.name();

//        Smartphone smob1 = new Smartphone(); //POSSIBLE

        Phone obj = new Smartphone();  //Yes it is allowed
        obj.on();
        obj.showTime();

//        obj.music(); Not allowed due to reference
//        It works only when overriding

//        Smartphone obj2 = new Phone();  NOT POSSIBLE / not allowed
    }
}
