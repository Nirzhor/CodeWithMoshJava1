package com.nirzhor;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        byte input;

        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        input = scan.nextByte();

        if ( input % 5 == 0 && input % 3 == 0)
            System.out.println("FizzBuzz");
        else if ( input % 5 == 0)
            System.out.println("Fizz");
        else if ( input % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(input);


        //******************* Another solve for DRY **********************////

        if ( input % 5 == 0 ){
            if ( input % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if ( input % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(input);
    }


}
