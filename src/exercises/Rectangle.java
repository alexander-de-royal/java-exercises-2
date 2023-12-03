package src.exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        System.out.println("Enter length");
        int breadth = s.nextInt();
        System.out.println("Enter breadth");

        int area = length * breadth;

        System.out.println("Area of a rectangle is " + area);
    }
}
