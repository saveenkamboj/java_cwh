package com.company;

class EkClass{
    public int a;


    public EkClass(int v){
        this.a = v;
        System.out.println("I am i EkClass with value of :"+v);
    }

    public int returnOne(){
        return 1;
    }
    public int getA() {
        return a;
    }
}


class DoClass extends EkClass{
    public DoClass(int c){
        super(c);
        System.out.println("I am constructor hoon of DoClass");
    }
}
public class this_super_47 {
    public static void main(String[] args) {
//        EkClass e = new EkClass(5);
//        System.out.println(e.getA());

        DoClass d = new DoClass(32);



    }
}
