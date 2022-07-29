package com.bootcampexercise.module10;

public class Calculator {

    public static void main(String[] args) {

        int x = 20;
        int y = 5;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition - " + add(x,y));
        System.out.println("Addition1 - " + add(nums));
        System.out.println("Subtraction - " + subtract(x,y));
        //System.out.println("Multiply - " + multiply(x,y));
        System.out.println("Divide - " + divide(x,y));

    }

    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int[] numbers) {
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp + numbers[i];
        }
        return temp;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        try {
            if (y == 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Division by 0 is not possible");
        }
            return x / y;

    }
    public static int multiply(int x, int y) {
        try { if (x == -5)  {
            throw new ArithmeticException("No negative numbers, please!");  }
        }
        catch (ArithmeticException e) {
            System.out.println("Multiplying with -5 is not possible!");
        }
        return x * y;
    }

}

