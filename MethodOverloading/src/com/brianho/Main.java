package com.brianho;

public class Main {

    public static void main(String[] args) {
        double test1 = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println(test1);
        double test2 = calcFeetAndInchesToCentimeters(157);
        System.out.println(test2);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
//        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
//            return ((feet * 12) + inches) * 2.54;
//        }
//        return -1;

        if (!(feet >= 0) && !(inches >= 0 && inches <= 12)) {
            return -1;
        }

        return ((feet * 12) + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
//        if (inches >= 0) {
//            return calcFeetAndInchesToCentimeters(inches / 12, 0);
//        }
//        return -2;

        if (!(inches >= 0)) {
            return -1;
        }

        System.out.println(inches/12);

        return calcFeetAndInchesToCentimeters((inches / 12), 0);
//        return calcFeetAndInchesToCentimeters((int)(inches / 12), (int)(inches % 12));
    }

}
