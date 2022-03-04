package com.discount;

public class ArithemeticTower {
    public static void main(String[] args) {

        int number = 20;

        makeTower(number);

    }

    public static void makeTower(int number) {
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

