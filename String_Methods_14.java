package com.company;

public class String_Methods_14 {
    public static void main(String[] args) {
        System.out.println("String Methods");

        String name = "Saveen";
        String b = new String("Lovely");
//        String are immutable, we cannot change the original string, but we can create a copy

        System.out.println(name);

//        Length
        int value = name.length();
        System.out.println(value);

//        LowerCase, UpperCase
        String lowerStr = name.toLowerCase();
        System.out.println(lowerStr);

//        Trim : Remove first and last blank spaces
        String nonTrimmedStr = "     Saveen Kamboj    ";
        String trimmedStr = nonTrimmedStr.trim();
        System.out.println(trimmedStr);

//        Substring : given sting to last
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));

//        Replace : All occurance
        System.out.println(name.replace('e','b'));
        System.out.println(name.replace("e","changed"));
        System.out.println(name.replace("n","chaudhary"));

//        Start with : return boolean
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("en"));

//        Character Index : return character
        System.out.println(name.charAt(2));

//        Index of : return Index -> First Occurance
        System.out.println(name.indexOf("e",4));
        System.out.println(name.lastIndexOf("e"));








    }
}
