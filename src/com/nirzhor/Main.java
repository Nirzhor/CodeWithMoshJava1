package com.nirzhor;

import org.w3c.dom.ls.LSInput;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /// System.out.println("Hello World !!");

        int age = 25;
        age = 30;
        System.out.println(age);

        int myAge = 40;
        int herAge = myAge;

        System.out.println(herAge);

        byte ageAgain = 32;
        int ViewsCountNumber = 123_456_789;
        long viewsCount = 3_123_456_789L ; // Lower or upper L is for Long type
        float price = 10.99F ; // Lower or upper F is for floating type
        char letter = 'A';
        boolean isEligible = false; /// Orange colored words are reserved keywords

        byte ageNew = 35;
        Date now = new Date();

        now.getTime();

        System.out.println("now");

        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1,2);
        System.out.println(point1);

        Point point2 = new Point(3,8);
        System.out.println(point2);

        point2 = point1;
        System.out.println(point2);

        point1.x = 2;
        System.out.println(point2);

        String msg = new String("Nirzhor");
        System.out.println(msg);

        String message = "Hello World";
        System.out.println(message);

        String message2 = "Hello World" + " !!";
        System.out.println(message2);

        String message3 = "Hello World"+ " !!";
        System.out.println(message3);

        System.out.println(message3.endsWith("!!"));
        System.out.println(message3.startsWith("!!"));

        System.out.println(message3.length());

        System.out.println(message3.indexOf("H"));
        System.out.println(message3.indexOf("m"));

        System.out.println(message3.replace("!","*")); // Not modify the original string
        System.out.println(message3);

        System.out.println(message3.toLowerCase()); // Not modify the original string
        System.out.println(message3.toUpperCase()); // Not modify the original string
        System.out.println(message3);

        message3 = "   Hello World" + "!! ";
        System.out.println(message3.trim()); // Not modify the original string
        System.out.println(message3);

        String Message = "Hello \"Nirzhor\"";
        System.out.println(Message);

        // C:\Windows\...
        String MESSAGE = "C:\\Windows\\...";
        System.out.println(MESSAGE);

        MESSAGE = "C:\nWindows\\...";
        System.out.println(MESSAGE);

        MESSAGE = "C:\tWindows\\...";
        System.out.println(MESSAGE);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));


        int[] Numbers = { 2, 3, 5, 1, 4 };

        System.out.println(Numbers.length);

        System.out.println(Arrays.toString(Numbers));

        Arrays.sort(Numbers);
        System.out.println(Arrays.toString(Numbers));

        int[][] Num = new int[2][3];
        Num[0][0] = 1;
        System.out.println(Arrays.deepToString(Num));

        int[][][] Numb = new int[2][3][5];
        Numb[0][0][0] = 1;
        System.out.println(Arrays.deepToString(Numb));

        int[][] NUM = { { 1, 2, 3} , { 4, 5, 6} };
        System.out.println(Arrays.deepToString(NUM));
        System.out.println(NUM[0][2]);

        final float PI = 3.1416f; // Final keyword for constant

        int result = 10 + 3; // 13
        System.out.println(result);

        int result2 = 10 / 3; // 3
        System.out.println(result2);

        double result3 = 10 / 3; // (double)10 / (double)3; 3.0
        System.out.println(result3);

        double result4 = (double)10 / (double)3; // 3.333333
        System.out.println(result4);

        int Z = 1;
        Z++; // Z = 2
        System.out.println(Z);

        int X = 1;

        int Y = X++; // Y = 1 , X = 2
        System.out.println(X); // 2
        System.out.println(Y); // 1

        Y = ++X; // Y = 3 , X = 3
        System.out.println(X); // 3
        System.out.println(Y); // 3

        X += 2; // X = X + 2; ( Augmented or compound ) // X = 3
        System.out.println(X); // 5

        X = 10 + 3 * 2;  // 10 + 6
        System.out.println(X);

        X = (10 + 3) * 2; // 13 * 2
        System.out.println(X);

        /// Implicit Casting or Automatically Casting
        short Xx = 1;
        int Yy = Xx + 2; // 1 + 2
        System.out.println(Yy);

        // byte > short > int > long > float > double
        double X1 = 1.1;
        double Y1 = X1 + 2;  // 1.1 + 2.0
        System.out.println(Y1);

        /// Explicit Casting or Automatically Casting
        double XA = 1.1;
        int YA = (int)XA + 2; // 1 +2
        System.out.println(YA);

        String A = "5";
        String C = "3.5";
        ///  Integer.parseInt(); // int
        ///   Short.parseShort(); // Short
        ///  Float.parseFloat(); // Float

        int B = Integer.parseInt(A) + 2 ;
        double D = Double.parseDouble(C) + 2; //2.00
        int E = (int)Double.parseDouble(C) + 4;
        System.out.println(B); // 5 + 2
        System.out.println(D); // 3.5 + 2.0
        System.out.println(E); // 3 + 4

        int RES = Math.round(1.1F); // 1  /// 1.9F = 2
        System.out.println(RES);

        RES = (int)Math.ceil(1.1F);  // Ceil returns double 2.0
        System.out.println(RES);

        RES = (int)Math.floor(1.1F); // Floor returns double 1.0
        System.out.println(RES);

        RES = Math.max(2,7);
        System.out.println(RES); // 7

        RES = Math.min(2,7);
        System.out.println(RES); // 2

        RES = (int)Math.random(); // random returns 0-1 , returns double
        System.out.println(RES);  // returns 0 Everytime for removing fractional

        double RES1 = Math.random(); // random returns 0-1 , returns double
        System.out.println(RES1);

        // for 0 - 100 multiply 100 and round it and explicit cast for int value
        RES = (int) Math.round(Math.random() * 100);
        System.out.println(RES);

        RES = (int) Math.random() * 100;  // 0 * 100
        System.out.println(RES); // 0

        RES = (int) (Math.random() * 100); // 0.x * 100 and take the int value
        System.out.println(RES);

        // $ 1,234,567
        // 0.1 => 10 %

        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        String RESU = currency.format(1234567.891); /// $ and 2 digit after dot
        System.out.println(RESU);

        NumberFormat Percent =  NumberFormat.getPercentInstance();
        String RESU1 = Percent.format(0.1); /// 0.0 - 1.0 or 0 - 100
        System.out.println(RESU1);

        String RESU2 =  NumberFormat.getPercentInstance().format(0.43); // Method chaining
        System.out.println(RESU2);

        Scanner scanner = new Scanner(System.in);

        /*

        System.out.print("Age : ");
        byte AGE = scanner.nextByte();
        System.out.println("You are " + AGE );

        System.out.print("Name : ");
        String Name = scanner.next();
        System.out.println(" You are " + Name);

        System.out.print("Full Name : ");
        String Name = scanner.nextLine();
        System.out.println(" You are " + Name);

        */

        System.out.print("Full Name : ");
        String Name = scanner.nextLine().trim();
        System.out.println(" You are " + Name);



    }
}
