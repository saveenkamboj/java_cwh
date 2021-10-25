package com.company;

public class Java_35_Practice_Set_on_Method {
    static void multi(int n){
        for (int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    static  void printstar(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0; j < i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        if(n == 1){
            return 1;
        }
        System.out.println("The value of n is "+ n);
        return  n + sumRec(n-1);
    }
    static void revStar(int n){
        for(int i = n; i>=0; i--){
            for(int j = n;j>i;j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Fibonacci Series
    0, 1, 1, 2 , 3, 5, 8, 13, 21, 34
     */
    static int fibo(int n){
        /*
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
         */

        if(n == 1 || n == 2){
            return n-1;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    static int averageVarArgs(int ...arr){
        int res = 0;
        for (int a : arr){
            res += a;
        }
        int avg = res/arr.length;
        return avg;
    }
    static  void printstarRec(int n){
        if ( n > 0){
           System.out.println("The value outside of n is "+n);

            printstarRec(n-1);
            System.out.println("The value of n after printstarRec is :"+n);
            for (int i = 0; i< n; i++){
                System.out.println("The value of inside n is "+n);
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//    Problem 1;
//        multi(6);

//    Problem 2;
//        printstar(4);

//    Problem 3 : Write a recursive function to calculate sum of first n natural numbers.
//    int c = sumRec(3);
//    System.out.println(c);

//    Problem 4
//        revStar(3);

//        Problem 5: Fibonacci Series
//    int result = fibo(4);
//    System.out.println(result);

//     Problem 6:Write a function to find average of a set of number passed as arguments
//        System.out.println(averageVarArgs(10,6,2));

//        Problem 7 : Print Problem 2 using recursion
        printstarRec(3);
    }
}
