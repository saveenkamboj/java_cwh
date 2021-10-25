package com.company;

import org.w3c.dom.ls.LSOutput;

public class MultiDimensional_Array_28 {
    public static void main(String[] args) {
        System.out.println("___Multi-Dimensional Array___");

        int [][] flats;
        flats = new int[2][3];

        int [][] marks = {
                {101,102,103},
                {201,202,203},
        };

//        Displaying the marks Array
        for (int i = 0 ; i < marks.length ; i++){
            for (int j = 0 ; j < marks[i].length; j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int [] i : marks){
            for (int j : i){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }



}
