package edu.dmacc.codedsm.hw5;

public class Calculator {

    public static void main(String[] args) {

        double squareRoot = (Math.sqrt(27d));
        int division = (Math.floorDiv(28, 5));
        double exponent = (Math.pow(2.2d, 4.0d));
        double random = (Math.round(Math.random() * 100));

        System.out.println("\nThe square root of 27 is " + squareRoot + ".");
        System.out.println("\n28 divided by 5, rounded down, is " + division + ".");
        System.out.println("\n2.2 to the 4th power is " + exponent + ("."));
        System.out.println("\nA randomly generated integer between 1 and 100 is " + (int) random + ".");

    }
}
