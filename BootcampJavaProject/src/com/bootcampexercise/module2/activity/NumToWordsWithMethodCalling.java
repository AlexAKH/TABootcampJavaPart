package com.bootcampexercise.module2.activity;

public class NumToWordsWithMethodCalling {
    public static void main(String[] args) {
        NumToWords numToWords = new NumToWords();
        numToWordsLogic(5);

    }
    public static void numToWordsLogic(int x) {
            switch (x) {
            case 1 -> System.out.println("The number is " + x + " = One");
            case 2 -> System.out.println("The number is " + x + " = Two");
            case 3 -> System.out.println("The number is " + x + " = Three");
            case 4 -> System.out.println("The number is " + x + " = Four");
            case 5 -> System.out.println("The number is " + x + " = Five");
            case 6 -> System.out.println("The number is " + x + " = Six");
            case 7 -> System.out.println("The number is " + x + " = Seven");
            case 8 -> System.out.println("The number is " + x + " = Eight");
            case 9 -> System.out.println("The number is " + x + " = Nine");
            case 10 -> System.out.println("The number is " + x + " = Ten");
            default -> System.out.println("Given value is not in the range 1-10");
        }
    }
}


