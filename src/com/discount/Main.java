package com.discount;

public class Main {
    //Create a new class “Discount”. Express the following rules in code (use logical operators):
    //On the bus you receive a discount if you are a senior citizen, a dog or a student.
    //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one
    //fiction book.
    //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.
    //Think about what datatypes are appropriate for the variables you need to declare.
    //Write the results to the console



    public static void main(String[] args) {

        boolean senior = true;
        boolean dog = true;
        boolean student = true;

        System.out.println("Bus discount " + (senior || dog || student));


        int nonFiction = 3;
        int Fiction = 1;

        System.out.println("Bookshop discount " + (nonFiction > 2 && Fiction >= 1));

        int alko = 0;
        int antialko = 1;

        System.out.println("Grocery store discount " + (alko == 0 && antialko >= 1));


    }
}
