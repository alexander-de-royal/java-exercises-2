package src.methodsdayfive;

public class MethodTest {
    public static void main(String[] args) {

        sum();
        printTable(344);
        int x = getSumOfOneToHundred();
        int sv = findSmallestValue(3435, 8787);
    }


    //1. ----------------------- no return type with no arguments-------------------
    static void sum(){
        int x = 343;
        int y = 600;

        int s = x + y;

        System.out.println("Total = " + s);
    }

    //2. ----------------------- no return type with arguments------------------
    static void printTable(int n){

        for (int i = 1; i<= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    //3. ---------------------- return type with no arguments ------------------

    static int getSumOfOneToHundred(){
        int s = 0;
        for (int i = 1; i <= 100; i++){
            s = s + i;
        }
        return s;
    }

    // 4. ------------------------ return type with arguments ---------------------

    static int findSmallestValue(int x, int y){
        if (x < y) {
            return x;
        }
        return y;
    }

}
