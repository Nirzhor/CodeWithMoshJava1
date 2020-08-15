package com.nirzhor;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args ){


        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        double Rate,Mortgage ,Principle,period ;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Principal: ");
        Principle = scanner.nextDouble();

        System.out.print(" Annual Interest Rate: ");
        Rate = scanner.nextDouble();
        Rate = ( Rate / PERCENTAGE ) / MONTHS_IN_YEAR;

        System.out.print(" Period (Years): ");
        period = scanner.nextDouble();
        period = period * MONTHS_IN_YEAR;

        Mortgage = Principle * ( ( Rate * Math.pow((1+Rate), period)) / (Math.pow((1+Rate),period) - 1));
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(Mortgage));
    }
}
