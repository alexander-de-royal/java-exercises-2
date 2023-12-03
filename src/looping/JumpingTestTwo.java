package src.looping;

public class JumpingTestTwo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){

            if (i ==5 || i == 9)

                return;

            System.out.println(i);
        }
        System.out.println("End of loop");
    }
}

