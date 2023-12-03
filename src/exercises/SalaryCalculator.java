package src.exercises;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        String md, ceo, manager, helper, post;

        int mdSalary = 230000;
        int ceoSalary = 250000;
        int managerSalary = 176000;
        int helperSalary = 145900;

        double mdBonus = 0.2;
        double ceoBonus = 0.2579;
        double managerBonus = 0.16;
        double helperBonus = 0.09;

        double mdTotalSalary = (mdSalary * mdBonus) + mdSalary;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your post: ");
        post = s.next();

        if (post.equals("md")){
            System.out.println(
                            "Your salary is: " + mdSalary +
                            " Your bonus is: " + mdBonus * mdSalary +
                            " Your total salary is: " + mdTotalSalary);
        } else if (post.equals("ceo")){
            System.out.println("Your salary is " + ceoSalary + ceoBonus);
        } else if (post.equals("manager")) {
            System.out.println("Your salary is " + managerSalary + managerBonus);
        } else {
            System.out.println("Your salary is " + helperSalary + helperBonus);
        }
    }
}
