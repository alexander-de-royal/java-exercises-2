// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String favoriteFood = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite food is " + favoriteFood);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        int x = 130;
//        float y = 3.14f;
//        boolean z = false;
//        char symbol = '@';
//        String name = "Bro";
//        String name2 = "water";
//        String name3 = "Kool-aid";
//        String temp;
//
//        temp = name2;
//        name2 = name3;
//
//        System.out.println("My number is: " + x);
//        System.out.println("My number is: " + y);
//        System.out.println("My number is: " + z);
//        System.out.println("My number is: " + symbol);
//        System.out.println("My name is : " + name);
//        System.out.println("My name is : " + name2);
//        System.out.println("My name is : " + name3);
//
//    }
//}