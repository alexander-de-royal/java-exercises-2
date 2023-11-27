import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        int radius = s.nextInt();

        int area = radius * radius;

        System.out.println(area);
    }
}
