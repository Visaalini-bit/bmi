package com.example.bmi;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "yes";  // ✅ initialized

        System.out.println("---- BMI CALCULATOR ----");

        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("\nEnter weight (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height unit (cm/m): ");
            String unit = sc.next();
            double height;

            if (unit.equalsIgnoreCase("cm")) {
                System.out.print("Enter height in cm: ");
                height = sc.nextDouble() / 100;  // convert to meters
            } else if (unit.equalsIgnoreCase("m")) {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
            } else {
                System.out.println("❌ Invalid unit. Please enter 'cm' or 'm'.");
                continue;
            }

            double bmi = weight / (height * height);
            System.out.printf("Your BMI is: %.2f\n", bmi);
            System.out.print("Category: ");
            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 24.9)
                System.out.println("Normal weight");
            else if (bmi < 29.9)
                System.out.println("Overweight");
            else
                System.out.println("Obese");

            System.out.print("\nWould you like to calculate again? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("\n✅ Thank you for using the BMI Calculator!");
    }
}