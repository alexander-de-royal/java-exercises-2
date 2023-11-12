// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



// SECTION TWELVE FOR NESTED LOOPS
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter # of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for(int i = 1; i <= rows; i++) {
//            System.out.println();
//            for (int j = 1; j <= columns; j++){
//                System.out.print(symbol);
//            }
//        }
//    }
//}

// SECTION ELEVEN FOR LOOPS
//public class Main {
//    public static void main(String[] args) {
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Happy New Year");
//    }
//}

// SECTION TEN WHILE LOOPS
// import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//        int age = Integer.parseInt("");
//
//        while (name.isBlank()) {
//            System.out.print("Enter your name ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello " + name);
//
//        do {
//            System.out.print("Enter your age ");
//            age = Integer.parseInt(scanner.nextLine());
//        } while (age.isBlank());
//        System.out.println("Hello, your age is  " + age);
//
//    }
//}

// SECTION NINE LOGICAL OPERATORS
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        int temp = 25;
//
//        if (temp > 30){
//            System.out.println("It is hot outside");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("It is warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("You are playing a game! Press Q to quit");
//        String response = scanner.next();
//
//        if(response.equals("Q") || response.equals("q")){
//            System.out.println("You quit the game");
//        } else {
//            System.out.println("You are still in the game");
//        }
//    }
//}

// SECTION EIGHT SWITCHES
//public class Main {
//    public static void main(String[] args) {
//        String day = "Friday";
//
//        switch (day){
//            case "Sunday":
//                System.out.println("It is Sunday!");
//                break;
//            case "Monday":
//                System.out.println("It is Monday!");
//                break;
//            case "Tuesday":
//                System.out.println("It is Tuesday!");
//                break;
//            case "Wednesday":
//                System.out.println("It is Wednesday");
//                break;
//            case "Thursday":
//                System.out.println("It is Thursday");
//                break;
//            case "Friday":
//                System.out.println("It is Friday");
//                break;
//            default:
//                System.out.println("That is not a day");
//        }
//    }
//}

// SECTION SEVEN IF STATEMENTS
//public class Main {
//    public static void main(String[] args) {
//        int age = 18;
//
//        if (age >= 18) {
//            System.out.println("You are an adult");
//        } else {
//            System.out.println(" You are not an adult");
//        }
//    }
//}

// SECTION SIX RANDOM NUMBERS
//import java.util.Random;
//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//
//        int x = random.nextInt(6) + 1;
//        double y = random.nextDouble();
//        boolean z = random.nextBoolean();
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//    }
//}

// SECTION FIVE MATH CLASS
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.max(x, y);
//        double p = Math.min(x, y);
//        double q = Math.abs(y);
//        double r = Math.sqrt(x);
//        double o = Math.round(x);
//        double c = Math.ceil(x);
//        double d = Math.floor(x);
//
//        System.out.println(z);
//        System.out.println(p);
//        System.out.println(q);
//        System.out.println(r);
//        System.out.println(o);
//        System.out.println(c);
//        System.out.println(d);
//
//        double b;
//        double a;
//        double h;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter side b: ");
//        b = scanner.nextDouble();
//
//        System.out.println("Enter side a: ");
//        a = scanner.nextDouble();
//
//        h = Math.sqrt((x*x) + (y*y));
//
//        System.out.println("The hypotenuse is : " + h);
//
//        scanner.close();
//    }
//}

// SECTION FOUR GUI APPLICATION
//import javax.swing.JOptionPane;
//public class Main {
//    public static void main(String[] args) {
//
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
//        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height "));
//        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
//    }
//}

// SECTION THREE OPERATORS
//public class Main {
//    public static void main(String[] args) {
//        int friends = 10;
//        friends--;
//        System.out.println(friends);
//    }
//}

// SECTION TWO
// import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//
//        scanner.nextLine();
//
//        System.out.println("What is your favorite food?");
//        String favoriteFood = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your favorite food is " + favoriteFood);
//    }
//}

// SECTION ONE
// public class Main {
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