package com.company;

public class methods_31 {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Method in Java");

        System.out.println(add(45,6));

//        Another way of calling a method : Using Class
        methods_31 obj1 = new methods_31();
        int s = obj1.add(4,5);
        System.out.println(s);
        int a = 34;
        int b = 35;
    }
}
