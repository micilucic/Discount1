package com.discount;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Makearray {
    public static void main(String[] args) {
        // fill array
        int[] array = new int[3];
        // 3 = drei Felder
        array[0] = 12;
        array[1] = 56;
        array[2] = 91;

        System.out.println(Arrays.toString(array));
        //initialize and fill array in one line
        int [] array2 = new int[] {12, 13, 70};
        System.out.println(Arrays.toString(array2));

        //change the value at position 2
        array[2] = 15;
        System.out.println(Arrays.toString(array));
    }
}