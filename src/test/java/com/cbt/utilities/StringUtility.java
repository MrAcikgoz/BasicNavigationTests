package com.cbt.utilities;

import java.sql.SQLOutput;

public class StringUtility {
    public static void verifyEquals (String expected, String actual){
        if(expected.equalsIgnoreCase(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected result is equal: "+expected);
            System.out.println("Actual result is equal: "+actual);
        }
    }
}
