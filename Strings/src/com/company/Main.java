package com.company;
public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println(myString);

        String numberString = "220.5";
        int myInt = 50;
        numberString = numberString + myInt;
        System.out.println(numberString);

        SubMain subMain = new SubMain();
        System.out.println(subMain.getText());
    }
}
