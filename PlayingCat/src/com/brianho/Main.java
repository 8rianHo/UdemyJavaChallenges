package com.brianho;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean lowerRange = temperature >= 25;
        boolean normalTemperatureRange = (lowerRange && temperature <= 35);
        boolean summerTemperatureRange = (lowerRange && temperature <= 45);

        if (!(summer) && normalTemperatureRange) {
            return true;
        }

        if ((summer) && summerTemperatureRange) {
            return true;
        }

        return false;
    }
}
