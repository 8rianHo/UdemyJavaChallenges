package com.brianho;

public class Main {

    private static final String INVALID = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID);
        } else {
            double minutesToDays = (minutes / 60) / 24;
            int years = (int) (minutesToDays / 365);
            int days = (int) (minutesToDays % 365);

            System.out.println(
                    (minutes + " min = ") +
                            (years + " y and ") +
                            (days + " d")
            );
        }
    }
}
