package com.discount;

public class ArithemeticTower {
    public static void main(String[] args) {

        long number = 202103;

        System.out.println(number);
        for (int i = 2; i < 10; i++) {
            System.out.println(number + " * " + i);
            number = number * i;
        }
        for (int index = 2; index < 10; index++) {
            System.out.println(number + " / " + index);
            number = number / index;
        }
        System.out.println(number);
    }
}

