package src;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = s.nextInt();

        for (int i = 1; i <= 10; i++){
            int p = n * i;
            System.out.println(n + " * " + i + " = " + p);
        }
    }
}
