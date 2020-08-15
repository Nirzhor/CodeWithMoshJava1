package com.nirzhor;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_function {

        public static void main(String[] args ){

            int Principle = 0;
            byte  years = 0;
            float annualInterest = 0 ;

            Principle =  (int) readNumber(" Principal ($1K - $1M): ", 1000,1_000_000);

            annualInterest =  (float) readNumber(" Annual Interest rate: ", 1,30);

            years =  (byte) readNumber(" Period (Years): ", 1,30);

            double Mortgage = calculateMortgage( Principle ,  annualInterest , years );

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
            System.out.println("Mortgage: " + mortgageFormatted );

        }


        public static double readNumber(
                String prompt ,
                double min ,
                double max ){

            Scanner scanner = new Scanner(System.in);
            double value;
            while(true){

                System.out.print(prompt);
                value = scanner.nextFloat();

                if( value >= min && value <= max)
                    break;
                System.out.println(" Enter a number between " + min + " and " + max );

            }

            return  value;
        }

        public static double calculateMortgage(
                int Principle,
                float annualInterest,
                byte  years) {

            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENTAGE = 100;

          short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
          float monthlyInterest = ( annualInterest / PERCENTAGE ) / MONTHS_IN_YEAR;

          double Mortgage = Principle * ( ( monthlyInterest * Math.pow((1+monthlyInterest), numberOfPayments)) / (Math.pow((1+monthlyInterest),numberOfPayments) - 1));


          return Mortgage;
        }



    }


