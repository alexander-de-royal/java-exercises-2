package src.exercises;

import java.util.Scanner;

public class BookArray {

    public static void main(String[] args) {

        // Create an array to store the prices of 10 books
        int[] bookPrices = new int[10];

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the prices of each book
        for (int i = 0; i< 10; i++){
            System.out.println("Enter the price of the book " + (i + 1) + ": ");
            bookPrices[i] = scanner.nextInt();
        }

        // Display the entered prices
        System.out.println("Prices of the books: ");
        for (int i = 0; i <10; i++){

            System.out.println("Book " + (i + 1) + ": $" + bookPrices[i]);
        }

        // Display the sum of books
        int sum = 0;
        for (int price : bookPrices){
            sum += price;
        }
        System.out.println("The sum of the book prices is: $" + sum);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }


}
