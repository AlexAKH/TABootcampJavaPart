package com.bootcampexercise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String[] args) {

        // Print all odd numbers less than 100
        int i = 1;
            System.out.println("The Odd numbers are: " );
            while (i <= 100) {
            if(i%2 != 0)
            System.out.println(i);
            i++;
            }
        }

    }