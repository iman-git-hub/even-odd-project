package com.example;

public class even_odd {

    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        even_odd checker = new even_odd();

        int number = 7;
        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
                return;
            }
        }

        System.out.println(number + " is " + checker.checkEvenOdd(number));
    }
}
