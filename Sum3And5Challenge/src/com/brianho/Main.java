package com.brianho;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ( (i % 3 == 0) && (i % 5 == 0) ) {
                sum = sum + i;
                System.out.println("Found number = " + i);
                count++;
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println(sum);
    }
}
