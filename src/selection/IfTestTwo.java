package src.selection;

import java.util.Scanner;

public class IfTestTwo {

    public static void main(String[] args) {

        int salary;

        Scanner s = new Scanner(System.in);
        System.out.println("Input your salary: ");
        salary = s.nextInt();

        if (salary <= 30000) {
            salary = salary + 8000;
        }
        System.out.println("Total salary = " + salary);
    }
}
