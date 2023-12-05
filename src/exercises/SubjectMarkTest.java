package src.exercises;

import java.util.Scanner;

public class SubjectMarkTest {
    public static void main(String[] args) {

        // Create an array to store the Subject and their Marks
        String[] subject = new String[5];
        int[] mark = new int[5];

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the subject
        for (int i = 0; i < 5; i++){
            System.out.println("Enter subjects " + (i + 1) + ": ");
            subject[i] = scanner.next();
        }

        // Prompt the user to enter the mark
        for (int i = 0; i < 5; i++){
            System.out.println("Enter marks " + (i + 1) + ": ");
            mark[i] = scanner.nextInt();

            // Display the entered strings
            System.out.println("Entered strings: ");
            for (String str: subject){
                System.out.println(str);
            }

            // Display the entered numbers
            System.out.println("Entered numbers: ");
            for(int num: mark){
                System.out.println(num);
            }

            // Close the Scanner to prevent resource leak
            scanner.close();
        }
    }
}
