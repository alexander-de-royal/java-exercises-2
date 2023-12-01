package src.selection;

import java.util.Scanner;

public class NestedIfTest {

    public static void main(String[] args) {

        /*
        *  ------------- Nested if-else --------------
        *
        *  Syntax
        *
        *   if (condition-1) {
        *
        *       if (condition-2) {.....
        *
        *   } else {
        *
        * */
        String citizen;
        int age;
        boolean haveVoteId = false;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your country of citizenship: ");
        citizen = s.next();
        System.out.println("Enter your age: ");
        age = s.nextInt();
        System.out.println("Do you have a voterID");
        haveVoteId = s.nextBoolean();

//        String citizen = "nepal";
//        int age = 33;

        if (citizen.equals("nepal")){
            if (age >= 18){
                System.out.println("You can vote");
                if (haveVoteId){
                    System.out.println("You have vote ID");
                } else {
                    System.out.println("You don't have vote ID");
                }
            } else {
                System.out.println("You are underage");
            }
        } else {
            System.out.println("invalid citizenship");
        }
    }
}
