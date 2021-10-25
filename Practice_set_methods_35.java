package com.company;

public class Practice_set_methods_35 {

    public static void multi(int n){
        for(int i = 1 ; i <= 10; i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i );
//            System.out.println(n+" X "+i+" : "+(n*i));
        }
    }


    public static void pattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static int sumRec(int n){
//        Base Condition - Compulsory in Recusion
        if (n == 1){
            System.out.println("If running");
            return 1;
        }
        else{
            System.out.println("Before calling sumRec n is :"+n);

            int sum = n + sumRec(n-1);

            System.out.println("The value of sum is : "+sum);
            return sum;
        }
    }
    /*
    sum = 4 + sumRec(3)
                |
                sum = 3 + sumRec(2)
                            |
                            sum = 2 + sumRec(1)

    If Running

    sum = 2 + 1
    The value of sum is : 3

    sum = 3 + 3
    The value of sum is : 6

    sum = 4 + 6
    The value of sum is : 10
     */

    public static void revStar(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = n ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static int fibSeries(int n)
    {
        if(n == 1 || n == 2){
            System.out.println("If is Called");
            return n-1;
        }
        else{
            System.out.println("Here else is called");
            int value = fibSeries(n-1) + fibSeries(n-2);
            System.out.println("The Value is : "+value);
            return value ;
        }
    }

    public static float average(int ...arr){
        float sum = 0;
        for(float ele : arr){
            sum += ele;
        }
        return sum/arr.length;
    }

    public static void recStar(int n){
        if(n > 0){
            recStar(n-1);
            System.out.println("The Value of n is :"+n);
            for(int i = 1 ; i <= n ; i++){
                System.out.print("* ");
            };
            System.out.println("");
        }
    }

    /*
    recStar(4)         n = 5
        |
        recStar(3)       n = 4
            |
            recStar(2)        n = 3
                |
                recStar(1)       n = 2
                    |
                    recStar(1-1 = 0)      n = 1
                    Here the n > 0 is false
                    then,

                    The value of n is :1
                    for Loop is running here

     */

    public static float cel_to_farh(float n){
        return n * 9/5 + 32;

    }

    public static void main(String[] args) {
        //Problem 1: print Multiplication table
//        multi(7);

        //problem 2 :print star pattern
//        pattern(10);

//        Problem 3: Sum of natural number
//        int c = sumRec(4);
//        System.out.println(c);

//        Problem 4: Reverse Star Pattern
//        revStar(10);

//        Problem 5: Fibonacci Series - Find out nth term
//        Fibonacci Series - 0,1,2,3,5,8,13,21,34
//        int result = fibSeries(5);
//        System.out.println(result);

//        Problem 6: Average using VarArgs
//        System.out.println(average(4,6,16));

//        Problem 7: Star Pattern using rec
//        recStar(5);

//        Problem 8: cel to farh (celsius to farhrenheit)
        System.out.println(cel_to_farh(4)+"F");
    }
}
