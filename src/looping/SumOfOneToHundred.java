package src.looping;

public class SumOfOneToHundred {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++){

            sum = sum + i;

            i++;
//            System.out.println(sum);

        }
        System.out.println(sum);
    }
}
