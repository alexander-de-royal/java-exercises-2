package src.looping;

public class DoWhileTest {
    public static void main(String[] args) {

        /*
        *  Syntax:
        *
        *   do {
        *       // Statements
        *       // inc/dec
        *       } while (condition);
        * */
        int n = 9;
        int i = 1;
        do {
//            System.out.println(i);
//            int p = n * i;

            System.out.println(n + "*" + i + " = " + n * i);
            i++;
        } while (i <=9 );
    }
}
