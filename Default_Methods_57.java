package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }//This private method is used inside default method

    default void record4KVideo(){
        greet();
        System.out.println("Recording 4k Video");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{

    void callNumber(int phone){
        System.out.println("Calling "+phone);
    }
    void pickCall(){
        System.out.println("Connecting .....");
    }

}

class MySmartphone extends Cellphone implements MyWifi,MyCamera{

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

public class Default_Methods_57 {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        /*
        String[] ar = ms.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }
         */
        for(String item : ms.getNetworks()){
            System.out.println(item);
        }

        ms.record4KVideo();
    }
}
