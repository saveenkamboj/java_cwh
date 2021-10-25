package com.company;
import java.time.*;
class c1{
    public int a = 11;
    protected int b = 23;
    int c = 33;
    private int d = 45;

    public void meth1(){
//        This all are acessible with in the class
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class _66_Acess_Modifer {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();

//        Private are not accessible within the package
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
//        System.out.println(c.d); ERROR due to private modifer

    }
}
