package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void firstName(){
        String firstName="Kaj";

        String pattern= "^[A-z]{3,}";
        Pattern r= Pattern.compile(pattern);

        Matcher m = r.matcher(firstName);


        if(m.matches()){
            System.out.println("First Name Matched :" );

        }else
        {
            System.out.println(" First Name No Matched :");
        }

    }
    public static void lastName(){

            String lastName="kaj";

            String pattern= "^[A-z]{3,}";
            Pattern r= Pattern.compile(pattern);

            Matcher m = r.matcher(lastName);


            if(m.matches()){
                System.out.println(" Last Name Matched Pattern:" );

            }else
            {
                System.out.println("Last Name  No Matched :");
            }

        }
        public static void email(){
        String email ="manekajal@gmail.com";
        String pattern= "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
            Pattern r= Pattern.compile(pattern);

            Matcher m = r.matcher(email);


            if(m.matches()){
                System.out.println(" email Matched :" );

            }else
            {
                System.out.println("email  No Matched :");
            }
        }
        public static void mobileNumber()
        {
            String str= "91-9765326068";
            String pattern = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
            Pattern r= Pattern.compile(pattern);

            Matcher m;
            m = r.matcher(str);

            if(m.matches()){
                System.out.println(" Mobile Number is Matched :" );

            }else
            {
                System.out.println("  Mobile Number is Not Matched :");
            }
       }

       public static void password(){

        String password="Kajalmane0";
        String pattern="(?=.*?[A-Z])(?=.*?[0-9])[A-Za-z]{8,}";

           Pattern r= Pattern.compile(pattern);

           Matcher m;
           m = r.matcher(password);

           if(m.matches()){
               System.out.println(" Password is Matched :" );

           }else
           {
               System.out.println(" Password is  Not Matched :");
           }
       }


    public static void main(String[] args){
        System.out.println(" java Regex :");

        System.out.println();

        firstName();
        System.out.println();
        lastName();
        System.out.println();
        email();
        System.out.println();
        mobileNumber();
        System.out.println();
        password();

    }
}
