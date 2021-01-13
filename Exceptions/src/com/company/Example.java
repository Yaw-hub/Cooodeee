package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("no suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }


    private static int getInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an integer ");
        while(true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                //go round again. Read past the end of line in the input first
                input.nextLine();
                System.out.println("Please enter a number using only the digits 0 - 9");
            }
        }
    }
}
