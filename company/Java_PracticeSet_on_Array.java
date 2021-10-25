package com.company;


import javax.swing.*;

public class Java_PracticeSet_on_Array {
    public static void main(String[] args) {
        /*
        Reverse of Array
        int [] number = {1,2,3,4,5};
        int len = number.length;
        int n = Math.floorDiv(len,2);
        int temp;
//        System.out.println(n);
        for(int i = 0 ; i< n; i++){
            temp = number[i];
            number[i] = number[len-1-i];
            number[len-1-i] = temp;
        }
        for(int ele:number){  //Printing the Array
            System.out.println(ele);
        }
         */

//        Maximum and Minimum Number in Java
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);

//        Is Maximum No
        /*
        int [] array = {2,455,3,53,5456,56};
        int max = Integer.MIN_VALUE;
        for (int num : array){
            if(num>max){
                max = num;
//                System.out.println(max);
            }
        }
//        System.out.println(max);
        */

//        Matric Addition
        /*
        int [][] arr1 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] arr2 = {
                {12,34,2},
                {8,2,9}
        };
        int [][] result = {
                {0,0,0},
                {0,0,0}
        };
        for (int i = 0 ; i< arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                result[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(result[i][j]+ " ");
            }
            System.out.println("");
        }
         */

//        Array Sorted or Not
        /*
        int [] array = {1,3,4,5,7,455,330};
        boolean issorted = true;
        for(int i = 0 ; i<array.length-1;i++){
            if(array[i]>array[i+1]) {
                issorted = false;
                break;
            }
        }
        if(issorted) System.out.println("Array is Shorted");
        else System.out.println("Array is not Shorted");
         */




    }
}
