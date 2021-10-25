package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }//This private method is used inside default method

    default void record4KVideo(){
//        greet();
        System.out.println("Recording 4k Video");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{

    void callNumber(int phone){
        System.out.println("Calling "+phone);
    }
    void pickCall(){
        System.out.println("Connecting .....");
    }

}

class MySmartphone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Video...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Network");
        String[] networkList = {"Harry", "Tom", "Bittu"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);

    }

//    @Override
//    public void record4KVideo(){
//        System.out.println("Recording 4k Video inside MySmartphone");
//    }
}

public class Polymorphism_in_Interfaces_59 {

    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartphone2();

//        cam1.getNetworks();  ERROR  it uses method of Wifi2  <Not allowed>
//        This is a smartphone but, use it as a camera

        cam1.record4KVideo();  //Possible

        MySmartphone2 sm = new MySmartphone2();
        sm.callNumber(342);

        for(String ele : sm.getNetworks()){
            System.out.println(ele);
        }

    }
}
