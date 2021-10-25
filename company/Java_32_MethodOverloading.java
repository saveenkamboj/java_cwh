package com.company;

public class Java_32_MethodOverloading {
    static void tellJoke(){
        System.out.println("I invented a new word");
    }
    static void change(int a){
        a = 3445;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    public static void greet(){
        System.out.println("Good Moring 1st Greet");
    }
    static void greet(int a){
        System.out.println("Good Morning 2nd Greet");
    }
    static void greet(int a,int b){
        System.out.println("Good Morning 3rd Greet");
    }
    /*  --Not Possible here Method Overloading
    static int greet(int a,int b){
        System.out.println("Good Morning 3rd Greet");
    }
    */

    public static void main(String[] args) {
//        tellJoke();


//        Case 1 : Changing the Integar
        int x = 34;
        change(x);
        System.out.println("The value of x after running is "+x);


//        Case 2 : Changing the value of Array
//        Passing Array to Method
        int [] marks = {23,34,45,12};
        change2(marks);
        System.out.println("The value of marks[0] is "+marks[0]);

//        Method Overlaoding
        greet();
        greet(4);
        greet(34,5);  //Arguments are Actual 34, 5

    }
}
/*When we don't want our method to return anything we used void as the return type.

Static Keyword :
Static keyword is used to associate a method of a given class with the class rather than the object. Static Method in a class is shared by all the objects.

Method Overloading:
Two or more methods can have same name but different parameters.
Example :
    static void greet()
    static void greet(int a)
    static void greet(int a, int b)
NOTE : Method Overloading cannot be performed by changing the return type of methods.
*/
