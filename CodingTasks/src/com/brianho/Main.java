package com.brianho;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(2050);
//        bark(true, 1);
//        bark(false, 2);
//        bark(true, 8);
//        bark(true, -1);
//        isLeapYear(-1600);
//        isLeapYear(1600);
//        isLeapYear(2017);
//        isLeapYear(2000);
//        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(isEqualSum(1, 1, 0) ? "true" : "false");
        System.out.println(isEqualSum(1, -1, 0) ? "true" : "false");

    }

    public static boolean hasTeen(int p1, int p2, int p3) {
        int[] params = { p1, p2, p3 };
        for (int i = 0; i < params.length; i++) {
            if (params[i] >= 13 && params[i] <= 19) {
                return true;
            }
            continue;
        }
        return false;
    }

    public static boolean isEqualSum(int p1, int p2, int p3) {
        if (p1 + p2 == p3) {
            return true;
        }

        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int d1i = (int) (d1*1000);
        int d2i = (int) (d2*1000);

        if (!(d1i == d2i)) {
            return false;
        }

        return true;
    }

    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (hourOfDay < 8 || hourOfDay > 22) {
            if (barking) {
                return true;
            }
            return false;
        } else {
            if (barking) {
                return false;
            }
        }

        return false;
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
