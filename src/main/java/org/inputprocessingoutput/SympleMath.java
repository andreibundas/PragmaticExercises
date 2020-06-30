package org.inputprocessingoutput;

import java.util.Scanner;

public class SympleMath {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter a number (String): ");
        String number1 = input.next();
        System.out.print("Enter a second number (String):  ");
        String number2 = input2.next();

        int i1 = Integer.parseInt(number1);
        int i2 = Integer.parseInt(number2);

        // adding i1 and i2
        int sum = 0, sub = 0, mult = 0, div = 0;
        sum = i1 +  i2;
        System.out.println("The sum = " + sum);

        // subtracting i1 and i2
        sub = i1 - i2;
        System.out.println("Subtraction = " + sub);

        // Multiplying i1 and i2
        mult = i1 * i2;
        System.out.println("Multiplication = " + mult);

        // division i1 and i2
        //div = i1 / i2;
        System.out.println("Division = " + div);
        // System.out.println( number1 + number2 = String.valueOf(i1 / i2));

    }


}
