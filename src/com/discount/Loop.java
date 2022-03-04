package com.discount;

public class Loop {
    public static void main(String[] args) {
        countToHundred(1);
        countToHundredInclusive(1);
    }

    public static void countToHundred(int from) {
        System.out.println(from);
        do {
            from++;
            System.out.println(from);
        } while (from < 100);
    }

    public static void countToHundredInclusive(int from) {
        System.out.println(from);
        do {
            from++;
            System.out.println(from);
        } while (from < 100);
    }
}
