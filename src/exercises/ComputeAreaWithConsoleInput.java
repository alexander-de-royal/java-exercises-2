package src.exercises;

import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14;

        // Display results
        System.out.println("The area is " + area);

    }
}
