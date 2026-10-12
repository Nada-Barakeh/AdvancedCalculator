package org.example;

import service.CalculatorService;

import java.util.Scanner;

public class Main {

    static CalculatorService calculator = new CalculatorService();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getUserChoice();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                performOperation(choice);
            } catch (ArithmeticException e) {

                System.out.println(" Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println(" Invalid input. Please enter a valid number.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Advanced Calculator ---");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        System.out.println("5. Square Root (√)");
        System.out.println("6. Natural Log (ln)");
        System.out.println("7. Log base 10 (log)");
        System.out.println("8. Sin (degrees)");
        System.out.println("9. Cos (degrees)");
        System.out.println("10. Tan (degrees)");
        System.out.println("10. Cosh (degrees)");
        System.out.println("11. Power (x^y)");
        System.out.println("12. Factorial (!)");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private static void performOperation(int choice) {
        double result = 0;
        double num1, num2;

        switch (choice) {
            case 1: // Add
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = calculator.add(num1, num2);
                break;

            case 2: // Subtract
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = calculator.subtract(num1, num2);
                break;

            case 3: // Multiply
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = calculator.multiply(num1, num2);
                break;

            case 4: // Divide
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                result = calculator.divide(num1, num2);
                break;

            case 5: // Square Root
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                result = calculator.sqrt(num1);
                break;

            case 6: // Natural Log
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                result = calculator.log10(num1);
                break;

            case 7: // Log base 10
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
                result = calculator.log10(num1);
                break;

            case 8: // Sin
                System.out.print("Enter angle in degrees: ");
                num1 = scanner.nextDouble();
                result = calculator.sin(num1);
                break;

            case 9: // Cos
                System.out.print("Enter angle in degrees: ");
                num1 = scanner.nextDouble();
                result = calculator.cos(num1);
                break;

            case 10: // Tan
                System.out.print("Enter angle in degrees: ");
                num1 = scanner.nextDouble();
                result = calculator.tan(num1);
                break;

            case 11: // Power
                System.out.print("Enter base: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                num2 = scanner.nextDouble();
                result = calculator.power(num1, num2);
                break;

            case 12: // Factorial
                System.out.print("Enter a positive integer: ");
                int n = scanner.nextInt();
                result = calculator.factorial(n);
                break;

            default:
                System.out.println(" Invalid option. Please try again.");
                return;
        }


        System.out.println("Result: " + result);
    }
}