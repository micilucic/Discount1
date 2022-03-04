package com.discount;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner vowelcheck = new Scanner(System.in);
        System.out.println("Enter a letter: ");

        String letter = vowelcheck.next();

        while (!letter.equals("0")) {
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("u") || letter.equals("o")) {
                System.out.println("This is a vowel");
                letter = vowelcheck.next();
            } else {
                System.out.println("It is not a vowel");
                letter = vowelcheck.next();
            }
        } vowelcheck.close();

    }
}
