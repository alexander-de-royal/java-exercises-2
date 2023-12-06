package src.array;

import java.util.Arrays;

public class ArrayWithMethod {
    public static void main(String[] args) {

        /*
        * ------------ Array with Method -----------------
        * 1) array as argument:
        *
        *   void add (int a[]){
        *
        *   }
        *
        * 2) array as return type:
        *
        *   int[] get10IntValues(){
        *       // array = 1,2,3,4,5,6,7,8,9
        *   return array;
        *   }
        * */

        int array[] = {1,2,3,4,5,6,7,8,9};
        sum(array);

        int[] odds = getOddNumsFrom1to100();
        System.out.println(Arrays.toString(odds));
    }

    //------------------ Array as arguments ------------------
    static void sum(int values[]){
        int s = 0;

        for (int x : values){
            s += x;
        }
        System.out.println("Total = " + s);
    }

    static int[] getOddNumsFrom1to100(){

        int oddnums[] = new int[50];
        int j = 0;

        for (int i = 1; i <= 100; i++){

            if (i % 2 != 0){

                oddnums[j] = i;
                j++;
            }
        }
        return oddnums;
    }
}
