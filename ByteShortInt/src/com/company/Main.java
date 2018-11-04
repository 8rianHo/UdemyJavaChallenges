package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int intMin = -2_147_483_648;
        int intMax = 2_147_483_647;
        int intDiv = (intMin/2);

        // byte has a width of 8
        byte byteMin = -128;
        byte byteMax = 127;
        byte byteDiv = (byte) (byteMin/2);

        // short has a width of 16
        short shortMin = -32768;
        short shortMax = 32767;
        short shortDiv = (short) (shortMin/2);

        // long has a width of 64
        long longMin = -9_223_372_036_854_775_807L;
        long longMax = 9_223_372_036_854_775_807L;

        byte newByte = 100;
        short newShort = 30000;
        int newInt = 500000;
        long newLong = (50000L + 10L) * (newByte + newShort + newInt);

        System.out.println(newLong);
    }
}
