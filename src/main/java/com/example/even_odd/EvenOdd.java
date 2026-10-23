package com.example.even_odd;

public class EvenOdd {

    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(checkEvenOdd(n));
    }
}
