package com.brianho;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (!(number >= 10)) {
            return -1;
        }

        int sum = 0;
        while (number > 0) { // number > 0 because 1/10 as an int is 0
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        return sum;
    }
}
