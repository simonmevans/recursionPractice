package com.company;

public class StringPrintRec {
    private String str;

    public char printRec(int index){
        System.out.println(str.charAt(index));
        if(index == 0)
        {
            return str.charAt(0);
        }
        return printRec(index-1);
    }
    StringPrintRec()
    {
        str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        printRec(str.length()-1);
    }
}
