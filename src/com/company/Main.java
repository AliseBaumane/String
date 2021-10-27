package com.company;

public class Main {

    public static void main(String[] args) {
        String[] values = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        withC(values);
        withE(values);
        five(values);
        consistE(values);
        consistTE(values);
    }

    public static void withC(String[] values) {
        int cLetter = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].startsWith("C"))
                cLetter++;
        }

        System.out.println("There are " + cLetter + " words that start with the letter 'C'");
    }

    public static void withE(String[] values) {
        int eLetter = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].endsWith("e"))
                eLetter++;
        }

        System.out.println("There are " + eLetter + " words that end with the letter 'e'");
    }

    public static void five(String[] values) {
        int valueFive = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].length() == 5) {
                valueFive++;
            }
        }
        System.out.println("There are " + valueFive + " words that are 5 character long");
    }

    public static void consistE(String[] values) {
        int wordE = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].contains("e")) {
                wordE++;
            }
        }
        System.out.println("There are " + wordE + " words containing letter 'e' ");
    }

    public static void consistTE(String[] values) {
        System.out.println("Is there any element which consists of the subString 'te'");
        //int te = 0;
        //for (int i = 0; i < values.length; i++) {
        //while doing I understood that there is no need for loop but I will leave it here if that is not correct
          int i=0;
            if (values[i].contains("te"))
                System.out.println("Yes");
            else {
                System.out.println("No");

            }
        }
    }



