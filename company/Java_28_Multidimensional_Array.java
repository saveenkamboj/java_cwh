package com.company;

public class Java_28_Multidimensional_Array {
    public static void main(String[] args) {
        /*
        MultiDimensional Array are Array of Arrays .
         */
        int [] marks = {234,34,645,34};  //1-D Array

        int [][] flats ;  //2-D Array
        flats = new int[2][3];

        flats[0][0]  = 100;
        flats[0][1]  = 101;
        flats[0][2]  = 102;
        flats[1][0]  = 200;
        flats[1][1]  = 201;
        flats[1][2]  = 202;

        System.out.println("Printing a 2-D Array using Loop");
        for (int i = 0; i< flats.length; i++){
            for (int j = 0 ; j< flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Using Enhnaced For Loop");
        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i+" ");
            }
            System.out.println();
        }



    }
}
