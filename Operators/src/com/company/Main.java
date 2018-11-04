package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        // ++ -- += *= -= /= operators

        boolean isAlien = false;

        if (isAlien) {
            System.out.println("not an alien");
        } else {
            System.out.println("nah");
        }

        double firstVariable = 20;
        double secondVariable = 80;
        double thirdVariable = (firstVariable + secondVariable) * 25;
        double remainder = thirdVariable % 40;

        System.out.println(remainder);
        if (remainder <= 20) {
            System.out.println("yeah");
        } else {
            System.out.println("no");
        }
    }
}
