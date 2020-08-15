package com.nirzhor;

public class Clean_Coding {

    public static void main(String[] args) {

        greet("Nirzhor","Bhai" );
        greet("Niloy", "babu");

    }

    public static void greet(String firstName, String lastName){

        System.out.println("Hello " + firstName + " " + lastName);

    }

    public static String greetUser(String firstName, String lastName){

          return "Hello " + firstName + " " + lastName;

    }
}
