package src.looping;

public class EnhancedForLoop {
    public static void main(String[] args) {

        /*
        * ------------ Enhance for loop / forEach loop ---------------
        *
        *   # used to read data from collection.(array, list, set, map, etc)
        *
        *   Syntax:
        *   for (data_type var : collection)
        *       {
        *           // Statements
        *       }
        * */

        int[] values = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int x: values){

            sum = sum + x;
            x++;

            System.out.println(x);
        }
    }
}
