package src.selection;

import java.util.Scanner;

public class LadderTest {
    public static void main(String[] args) {

        /*
        *  -------------- else - if / ladder -----------------
        *
        * Syntax:
        *
        * if (condition-1) {
        *   // statements
        * } else if (condition-2){
        *   // statements
        * } else {
        *   // statements
        * }
        * */

        int units;

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter unit range from 0 to 350");
        int unit = s.nextInt();

        if (unit == 80){
            System.out.println("There is not charge in your account");
        } else if (unit >= 80 && unit <= 150){
            System.out.println("The current charge in your account is $5");
        } else if (unit >= 151 && unit <= 250) {
            System.out.println("The current charge in your account is $7");
        } else if (unit >= 251 && unit <= 350) {
            System.out.println("The current charge in your account is $10");
        } else {
            System.out.println("The current charge in your account is $12");
        }
    }
}
