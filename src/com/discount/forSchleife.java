package com.discount;

public class forSchleife {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        for (int index = 50; index <= 100; index++) {
            sum+= index;
        }
        System.out.println(sum);

        //String sentence = "Finally Weekend!";
       // for (int j = 0; j < 10; j++) {
         //   System.out.println(sentence);

            String sentence = "Finally Weekend!";
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " " + sentence);

        }
    }
}
