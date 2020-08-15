package com.nirzhor;

public class Main_part2 {

    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        System.out.println(x == y); // Equality operator // true 1 == 1

        // Logical operator

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // logical and operator
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = ( hasHighIncome || hasGoodCredit ) && !hasCriminalRecord ; // from left to right check
        // hasCriminalRecord becomes TRUE for ! ( not) operator
        System.out.println(isEligible);

        int temp = 32;
        if( temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water.");
        }
        else if ( temp > 20 ){
            System.out.println("Beautiful day.");
        }
        else {
            System.out.println("Cold day.");
        }


        ///---------------------------------////
        int income = 120_000;
        boolean hasHighIncomes ;

        if ( income > 100_000)
            hasHighIncomes = true;
        else
            hasHighIncomes = false;

        /// ---------------------------------///
        int income2 = 120_000;
        boolean hasHighIncome2 = false ;

        if ( income2 > 100_000)
            hasHighIncome2 = true;

        ////------------------------------------////
        int income3 = 120_000;
        boolean hasHighIncome3 = (income3 > 100_000 );

        /// *******************************///

        int INCOME = 120_000;
        String className;
        if(INCOME > 100_000)
            className = "First";
        else
            className = "Economy";

        ////---------------------------------////
        className = "Economy";

        if(INCOME > 100_000)
            className = "First";

        ///---------------------------------///
        /// Ternary operator
        className = INCOME > 100_000 ? "First" : "Economy" ;

        /// --------------- Switch statement ---------------------///

        String role = "admin";

        switch ( role){
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println(" You're a guest");

        }

         if ( role == "admin")
             System.out.println("You're an admin");
         else if ( role == "moderator")
             System.out.println("You're a moderator");
         else
             System.out.println(" You're a guest");

         //-------------------------////





    }


}
