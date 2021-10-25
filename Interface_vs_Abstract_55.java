package com.company;

interface Bicycle{
    int a = 34;  //This is final/ constant
    void applyBrake(int dec);
    void speedUp(int inc);
}
//Interface properties are always final

interface HornBicycle{
    int b = 34;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{

    public void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

//    Always make the interface method as public
    @Override
    public void applyBrake(int dec) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int inc) {
        System.out.println("Applying Speed Up the cycle");

    }

    @Override
    public void blowHornK3g() {
        System.out.println("Khabhi Kushi Kabhi Gum Po Po Po Po");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Main Hoon Na Po Pee Poo");
    }
}

public class Interface_vs_Abstract_55 {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(34);
        System.out.println(cycleHarry.a); //You can do this

//        You cannot modify the properties in Interfaces as they are final
//        cycleHarry.a = 43; --ERROR

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();

    }
}
