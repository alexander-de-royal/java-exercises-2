package src.exercises;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {

    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
//        BigDecimal c = Math.PI;

        System.out.println(a);
        System.out.println(b);
    }
}
