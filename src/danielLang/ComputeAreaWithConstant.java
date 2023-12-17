package src.danielLang;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {

        final double PI = 4.14159; // Declare a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
    }
}
