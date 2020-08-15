package com.nirzhor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main_for {
    public static void main(String[] args) {

        /// System.out.println();
        System.out.println("************** for 1 ****************");

        for( int i = 1 ; i <= 5 ; i++){
            System.out.println(" Hello World " + i );
        }

        System.out.println("************** for 2 ****************");

        for( int i = 0 ; i < 5 ; i++){
            System.out.println(" Hello World " + i );
        }

        System.out.println("************** for 3 ****************");

        for( int i = 5 ; i > 0 ; i--){
            System.out.println(" Hello World " + i );
        }

        System.out.println("*************** while 1 ***************");

        int i = 5;
        while ( i > 0){
            System.out.println(" Hello World " + i );
            i--;

        }

        System.out.println("*************** while 2 ***************");

        String input = "";
        Scanner scan = new Scanner(System.in);

        /*
        while ( !input.equals("quit") ){

            System.out.print("Input:");

            input = scan.next().toLowerCase();
            System.out.println(input);

        }
        */

        System.out.println("*************** Do while 1 ***************");

        /*

        do{

            System.out.print("Input:");
            input = scan.next().toLowerCase();
            System.out.println(input);

        }while ( !input.equals("quit"));

        */

        System.out.println("*************** break and continue ***************");

        input = "";

        /*

        while ( !input.equals("quit") ){

            System.out.print("Input:");

            input = scan.next().toLowerCase();


            if(!input.equals("quit"))
                System.out.println(input);

            if(input.equals("pass"))
                continue; // Continue passes all the lines or the block after it

            if(input.equals("quit"))
                break; // Break ends from the current block

            System.out.println(input);

        }
        */


        System.out.println("*************** break and continue 2 ***************");

        input = "";

        /*

        while ( true ) {

            System.out.print("Input:");

            input = scan.next().toLowerCase();


            if(!input.equals("quit"))
                System.out.println(input);

            if(input.equals("pass"))
                continue; // Continue passes all the lines or the block after it

            if(input.equals("quit"))
                break; // Break ends from the current block

            System.out.println(input);

        }
        */

        System.out.println("*************** for each loop ***************");

        String[] fruits = { "Apple", "Mango", "Orange" };

        for ( int j = 0; j < fruits.length; j++)
            System.out.println(fruits[j]);

        for( String fruit : fruits)
            System.out.println(fruit);
        
        /*

        for ( int j = fruits.length; j > 0; j--)
            System.out.println(fruits[j]);

        */
    }
}
