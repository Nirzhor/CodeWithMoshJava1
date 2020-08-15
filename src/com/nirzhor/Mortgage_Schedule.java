package com.nirzhor;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Schedule {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args ){

        int Principle = 0;
        byte  years = 0;
        float annualInterest = 0 ;

        Principle =  (int) readNumber(" Principal ($1K - $1M): ", 1000,1_000_000);
        annualInterest =  (float) readNumber(" Annual Interest rate: ", 1,30);
        years =  (byte) readNumber(" Period (Years): ", 1,30);

        printMortgage(Principle, years, annualInterest);
        printPaymentSchedule(Principle, years, annualInterest);
    }

    private static void printMortgage(int principle, byte years, float annualInterest) {

        double Mortgage = calculateMortgage(principle, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted );
    }

    private static void printPaymentSchedule(int principle, byte years, float annualInterest) {

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------- ");
        for(short month = 1; month <= years * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principle, annualInterest, years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
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


    public static double calculateBalance(
            int Principle,
            float annualInterest,
            byte  years,
            short numberOfPaymentsMade){


        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = ( annualInterest / PERCENTAGE ) / MONTHS_IN_YEAR;

        double balance = Principle
                * (Math.pow(1 + monthlyInterest , numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest , numberOfPayments) - 1 );
        return balance;
    }


    public static double calculateMortgage(
            int Principle,
            float annualInterest,
            byte  years) {

        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = ( annualInterest / PERCENTAGE ) / MONTHS_IN_YEAR;

        double Mortgage = Principle * ( ( monthlyInterest * Math.pow((1+monthlyInterest), numberOfPayments)) / (Math.pow((1+monthlyInterest),numberOfPayments) - 1));


        return Mortgage;
    }



}
