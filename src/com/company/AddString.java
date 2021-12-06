package com.company;

public class AddString {

    public static String stringAddRemoveIgnore(String toUpdate, String toRemove, String toIgnore ){
        String withString = "";
        toUpdate = toUpdate.replace(toRemove, "");

        char[] chars = new char[toUpdate.length()];

        toUpdate.getChars(0, toUpdate.length(), chars, 0);
        for(int i = 0; i < toUpdate.indexOf(toIgnore); i++){
            withString = withString + chars[i] + "-";
        }
        withString = withString + toIgnore;

        return withString;
    }
}
