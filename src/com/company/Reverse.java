package com.company;

public class Reverse {

    public static String reverseString(String incomingString){
        String reversedString = "";
        char[] charReverse;
        charReverse = new char[incomingString.length()];

        incomingString.getChars(0, incomingString.length(), charReverse, 0);
        for(int i = 0; i < incomingString.length(); i++){
            reversedString = reversedString+charReverse[incomingString.length() - (1 + i)];
        }

        return reversedString;
    }

    public static int[] reverseIntArray(int[] incomingIntArray){
        int[] reversedIntArray;
        reversedIntArray = new int[incomingIntArray.length];

        for(int i = 0; i < incomingIntArray.length; i++) {
            reversedIntArray[i] = incomingIntArray[incomingIntArray.length - (1+i)];
        }

        return reversedIntArray;
    }

    public static char[] reverseCharArray(char[] incomingCharArray){
        char[] reversedCharArray;
        reversedCharArray = new char[incomingCharArray.length];

        for(int i = 0; i < incomingCharArray.length; i++) {
            reversedCharArray[i] = incomingCharArray[incomingCharArray.length - (1+i)];
        }

        return reversedCharArray;
    }

    public static char[] reverseStringToCharArray(String incomingStringToCharArray){
        char[] reversedCharArray = new char[incomingStringToCharArray.length()];
        char[] charsToReverse = new char[incomingStringToCharArray.length()];

        incomingStringToCharArray.getChars(0, incomingStringToCharArray.length(), charsToReverse, 0);
        for(int i = 0; i < incomingStringToCharArray.length(); i++){
            reversedCharArray[i] = charsToReverse[charsToReverse.length - (1+i)];
        }

        return reversedCharArray;
    }

    public static void main(String[] args) {
        String reverseMe = "Reverse Me If You Can";
        int[] ints = {2, 4, 3, 6, 7};
        System.out.println(reverseString(reverseMe));

        System.out.println("From String to Char Array:");
        for(int i = 0; i < reverseMe.length(); i++){
            System.out.print(reverseStringToCharArray(reverseMe)[i]);
        }

        System.out.println("\nChar Array:");
        for(int i = 0; i < reverseMe.length(); i++){
            System.out.print(reverseCharArray(reverseMe.toCharArray())[i]);
        }

        int[] reversedInts = reverseIntArray(ints);
        for(int i = 0; i < ints.length; i++){
            System.out.println(reversedInts[i]);
        }

    }
}
