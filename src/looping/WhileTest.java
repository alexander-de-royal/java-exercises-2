package src.looping;

public class WhileTest {
    public static void main(String[] args) {
        /*
        *  Syntax:
        *
        *   while (condition){
        *       {
        *           // Statements
        *           // inc/dec
        *       }
        * */

        int n = 6;
        int fact = 1;

        while(n > 1){
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }
}
