package com.company;

class Emp{
    int salary;
    public void setSalary(int n){ //Setter
        this.salary = n;
    }
    public int getSalary(){ //Getter
        return salary;
    }

    String name;
    public void setName(String n){ //Setter
        this.name = n;
    }
    public String getName(){ //Getter
        return name;
    }
}

class Cellphone{
    public void ringing(){
        System.out.println("Ringing--------");
    }
    public void vibrating(){
        System.out.println("Vibrating!!!!!!!");
    }
}

class Rectangle {
    int length;
    int breadth;

    public void setSide(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public void area(){
        int a = this.length * this.breadth;
        System.out.println("The Area is "+a);
    }
    public void parimeter(){
        int para = 2*(this.length+this.breadth);
        System.out.println("Perimeter is "+para);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }
    public void run(){
        System.out.println("Enemy is Running!!");
    }
}

public class Basic_Question_on_Object_Oriented_Programming_39 {
    public static void main(String[] args) {
        Emp obj1 = new Emp();
        obj1.setName("Vicky Pandey");
        obj1.setSalary(7000);

//        System.out.println(obj1.getName());
//        System.out.println(obj1.getSalary());


        Cellphone obj2 = new Cellphone();
//        obj2.ringing();
//        obj2.vibrating();

        Rectangle rec = new Rectangle();
        rec.setSide(4,5);
//        rec.area();
//        rec.parimeter();

        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}
