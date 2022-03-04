package com.discount;

public class Arreymetoda {
    public static void main(String[] args) {
        int[] schachtel = new int[]{3, 5, 7, 9, 11, 13, 17}; //Primzahlen = dividierbar durch 1 und sich, sonst nichts
        // Schachtel ist der Name von arrey

        printArray(schachtel);
        System.out.println(containsNumber(5, schachtel));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static boolean containsNumber(int number, int[] array) {
        boolean isContained = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                isContained = true;
            } else {
                isContained = false;
            }
        }
        return isContained;
    }
}
// System.out.print(array[i] + ", "); //statt println nur print schreiben, damit es nebeneinander steht und nicht untereinander !