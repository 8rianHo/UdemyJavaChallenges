package com.company;

public class Main {

    public static void main(String[] args) {
	    // width of 32
        int myInt = 5 / 2;
        // width of float 32
	    float myFloat = 5f / 3f;
	    // width of double 64
	    double myDouble = 5d / 3f;

        System.out.println("myInt " + myInt);
        System.out.println("myFloat " + myFloat);
        System.out.println("myDouble " + myDouble);

        double pound = 1.0;
        double kilograms = 0.45359237;

        double numberToConvert = 200;

        double poundToKilogram = (numberToConvert * pound)/kilograms;
        double kilogramToPound = (numberToConvert * kilograms)/pound;

        System.out.println(poundToKilogram);
        System.out.println(kilogramToPound);
    }
}
