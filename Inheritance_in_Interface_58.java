package com.company;

interface sampleInterface{
    public void meth1();
    public void meth2();
}
//Inheritance
interface childSampleInterface extends sampleInterface{
    public void meth3();
    public void meth4();
}

//Making class using childSampleInterface interface
class MySampleClass implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    @Override
    public void meth3() {
        System.out.println("Meth3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth4");
    }
}
public class Inheritance_in_Interface_58 {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
