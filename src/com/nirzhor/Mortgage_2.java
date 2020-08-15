package com.nirzhor;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_2 {
    public static void main(String[] args ){


        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        double Rate,Mortgage ,Principle,period ;

        Scanner scanner = new Scanner(System.in);


        /*
            System.out.print(" Principal ($1K - $1M): ");
            Principle = scanner.nextDouble();

        while( Principle < 1_000 || Principle > 1_000_000){
            System.out.println(" Enter a number between 1,000 and 1,000,000.");

            System.out.print(" Principal ($1K - $1M): ");
            Principle = scanner.nextDouble();
        }

        */

        while(true){

            System.out.print(" Principal ($1K - $1M): ");
            Principle = scanner.nextDouble();

            if( Principle >= 1_000 && Principle <= 1_000_000)
                break;
            System.out.println(" Enter a number between 1,000 and 1,000,000.");

        }


        System.out.print(" Annual Interest Rate: ");
        Rate = scanner.nextDouble();

        /*

        while( Rate <= 0 || Rate > 30){
            System.out.println(" Enter a value greater than 0 and less than or equal to 30.");

            System.out.print(" Annual Interest Rate: ");
            Rate = scanner.nextDouble();
        }

        */

        while(true){

            System.out.print(" Annual Interest Rate: ");
            Rate = scanner.nextDouble();

            if( Rate > 0 && Rate <= 30) {
                Rate = ( Rate / PERCENTAGE ) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println(" Enter a value greater than 0 and less than or equal to 30.");

        }



        System.out.print(" Period (Years): ");
        period = scanner.nextDouble();


        /*


        while( period <= 0 || period > 30){
            System.out.println(" Enter a value greater than 0 and less than or equal to 30.");

            System.out.print(" Period (Years): ");
            period = scanner.nextDouble();
        }


         */

        while(true){

            System.out.print(" Period (Years): ");
            period = scanner.nextDouble();

            if( period > 0 && period <= 30)
            {
                period = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println(" Enter a value greater than 0 and less than or equal to 30.");

        }


        Mortgage = Principle * ( ( Rate * Math.pow((1+Rate), period)) / (Math.pow((1+Rate),period) - 1));
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(Mortgage));

        /// Rate = MonthlyInterest = annualInterest
        /// Period = years = numberOfPayments
    }



}
