package com.company;

/**
 * This is a Description tag
 * <p></p><div style="background:black";>Hero Naam Yaad Rakhi</div></p>
 * @author Saveen (Programmming with Saveen)
 * @version 0.1
 * @see java docs
 * @since 2002
 */
public class _106_creating_javadoc_tag {
    /**
     * This is a program which can add two number easily most beautiful method of this class
     * @param a This is first number
     * @param b This is Second Number
     * @return This return the sum of two numbers
     * @throws  Exception if a is zero
     * @deprecated This is Depecated Method please use plus operator
     */
    public int add(int a, int b) throws Exception{
        if(a == 0){
            throw new Exception();
        }
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("This is my main Method");
    }


}
