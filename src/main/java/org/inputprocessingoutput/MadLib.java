package org.inputprocessingoutput;


import java.util.Scanner;

public class MadLib {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter the noun of your pet: ");
        String noun = input.next();
        System.out.print("Enter a verb ( ow you play with your pet): ");
        String verb = input2.next();
        System.out.print("Enter an adjective: ");
        String adjective = input3.next();
        System.out.print("Enter an adverb: ");
        String adverb = input4.next();

        System.out.println("You " + verb + " with your " + adjective + " " + noun + " " + adverb );

    }
}
