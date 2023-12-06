package src.array;

import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {

        /*
        * --------------MultiDArray-------------------
        *
        * */

        int mat[][] = new int[2][2];

        //write data
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println("Enter value for mat");
                mat[i][j] = 40;
            }
        }

        // read data
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(mat[i][j]);
            }
        }
    }
}
