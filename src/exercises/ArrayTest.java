package src.exercises;

import java.util.Scanner;

// Step 1 => Create an Array
// Step 2 => Write data in Array
// Step 3 => Read data in Array
public class ArrayTest {
    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        System.out.println("Enter age of 5 students: ");
        int age[] = new int[5];

        for (int i = 0; i < age.length; i++){
            age[i] = 20;


            for (int x:age){
                System.out.println(x);
            }

        }
    }
}
