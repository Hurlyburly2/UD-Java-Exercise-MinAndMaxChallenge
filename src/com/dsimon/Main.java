package com.dsimon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestNumber = Integer.MAX_VALUE;
        int lowestNumber = Integer.MIN_VALUE;
        boolean firstNumber = false;

        while(true) {
            System.out.println("Enter a number: ");

            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                break;
            }
            int newNumber = scanner.nextInt();
            scanner.nextLine();

            if (!firstNumber) {
                highestNumber = newNumber;
                lowestNumber = newNumber;
                firstNumber = true;
            } else if (newNumber > highestNumber) {
                highestNumber = newNumber;
            } else if (newNumber < lowestNumber) {
                lowestNumber = newNumber;
            }
        }

        if (firstNumber) {
            System.out.println("The highest number is " + highestNumber + " and the lowest number is " + lowestNumber);
        } else {
            System.out.println("No number was entered");
        }

        scanner.close();
    }
}
