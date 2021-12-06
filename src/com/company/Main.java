package com.company;

public class Main {

    public static void main(String[] args) {
        String reverseMe = "Reverse Me If You Can";
        int[] ints = {2, 4, 3, 6, 7};
        System.out.println(Reverse.reverseString(reverseMe));

        System.out.println("From String to Char Array:");
        for(int i = 0; i < reverseMe.length(); i++){
            System.out.print(Reverse.reverseStringToCharArray(reverseMe)[i]);
        }

        System.out.println("\nChar Array:");
        for(int i = 0; i < reverseMe.length(); i++){
            System.out.print(Reverse.reverseCharArray(reverseMe.toCharArray())[i]);
        }

        System.out.println("\nInteger Array:");
        int[] reversedInts = Reverse.reverseIntArray(ints);
        for(int i = 0; i < ints.length; i++){
            System.out.println(reversedInts[i]);
        }

        String toAddHyphen = "Hello, friend!";
        System.out.println(AddString.stringAddRemoveIgnore(toAddHyphen, " ", "!"));

    }
}
