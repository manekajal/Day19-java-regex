package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void uc1() {
        String firstName = "Kaj";

        String pattern = "^[A-z]{3}";
        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(firstName);


        if (m.matches()) {
            System.out.println("Matched Pattern:");

        } else {
            System.out.println(" No Matched :");
        }
    }

    public static void main(String[] args){
        System.out.println(" java Regex :");
        System.out.println();
        uc1();
    }
}
