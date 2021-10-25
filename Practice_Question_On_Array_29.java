package com.company;

public class Practice_Question_On_Array_29 {
    public static void main(String[] args) {
        //Practice Problem 1
        /*
        float [] marks = {34.4f, 45.6f, 98.1f};
        float sum = 0;
        for(float ele : marks){
            sum = sum + ele;
        }
        System.out.println("The Value of Sum is "+sum);
         */

//        Practice Problem 2 : match the Value
        /*
        float [] marks = {34.4f, 45.6f, 98.1f};
        float num = 45.6f;
        boolean isInArray = false;
        for(float ele : marks){
            if(num == ele) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Present in the Array");
        }
        else{
            System.out.println("Not Present !!! ERROR");
        }
         */

//        Practice Problem 3
        /*

        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{2,6,13},{3,7,1}};
        int [][] result = {{0,0,0},{0,0,0}};

        for (int i = 0 ; i < mat1.length ; i++){
            for (int j = 0 ; j < mat1[i].length ; j++){
//                System.out.format("\nThe Value of i = %d and value of j = %d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");

            }
            System.out.println("");
        }
         */

//        Problem 4: Reverse the Array
        /*
        int [] arr = {1,2,3,4,5};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0 ; i <= n ; i ++){
//            Swap a[i] and a[l-i-1]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int ele : arr){
            System.out.println(ele);
        }

//        Problem 5: maximum no in array
        int [] num = {51,2,34,3,45};
        int max = 0;
        for(int ele : num){
            if(ele > max){
                max = ele;
            }
        }
        System.out.println("The max number is "+max);

        //        Problem 6: Minimum no in array
        int [] num = {51,2,34,3,45};
        int min = Integer.MAX_VALUE;
        for(int ele : num){
            if(ele < min){
                min = ele;
            }
        }
        System.out.println("The Minimum number is "+min);
         */

//        Problem 7: Array Sorting
        boolean isSorted = true;
        int [] arr = {1,323,54,64,453};
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
              isSorted = false;
              break;
            }
        }
        System.out.println("Array is sorted : "+isSorted);

    }
}
