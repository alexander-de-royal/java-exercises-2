package src.array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        System.out.println("------reverse order---------");
//        for (int i = array.length-1; i >=0; i--){
//            System.out.println(array[i]+ " ");
//        }
        System.out.println(Arrays.toString(Arrays.copyOf(array,8)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,5,10)));

        Arrays.fill(array, 50);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 50);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 5, 10, 400);
        System.out.println(Arrays.toString(array));
    }
}
