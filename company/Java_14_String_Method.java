package com.company;
public class Java_14_String_Method {
    public static void main(String[] args) {
        String name = "Saveen";
//        String name1 = new String("Saveen");
//        System.out.println(name);

//        Strings are immutable and cannot change but it create a new string to do this operation

//        Length of the String
        int value = name.length();
        System.out.println("The Length of String is : "+value);

//        Lower Case
        String lstring = name.toLowerCase();
        System.out.println(lstring);

//        Upper Case
        String ustring = name.toUpperCase();
        System.out.println(ustring);

//        Trim  - Remove Trailing Space from String
        String nonTrmimmedString = "   Saveen   ";
        System.out.println(nonTrmimmedString);

        String trimmedString = nonTrmimmedString.trim();
        System.out.println(trimmedString);

//        here the start from 3rd index
        System.out.println(name.substring(3));

//        Returen a substring from start to the end index. Start index in included and end is excluded.
        System.out.println(name.substring(3,5));

//        Replace - All Occurance
        System.out.println(name.replace('e','i'));
        System.out.println(name.replace("e","zip"));

//        Start with - Return Bool
        System.out.println(name.startsWith("Sav"));
//        Ends with
        System.out.println(name.endsWith("een"));

//        Char At - Return Character at a given index position
        System.out.println(name.charAt(3));

//        Index of - Return the index of the given string(first occurance)
        String modifiedName = "Harryabcrry";
        System.out.println(modifiedName.indexOf("rry", 4));

//        Last Index of - Return the last occurance
        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry", 4));

//        Equal - Return true if the given string is equal (Case Sensitive)
        System.out.println(name.equals("saveen"));

//        Equal Ignore  (Non Case Sensitive)
        System.out.println(name.equalsIgnoreCase("Saveen"));

//        Escape Sequence Character
//        Sequence of character after backslash

        System.out.println("I am escape Sequence\tCharacte\"");









    }
}
