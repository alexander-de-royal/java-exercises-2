package src.javacollection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.fill(list, 99);
        System.out.println(list);

        List<Integer> ll = List.of(34,56,67,78,89);

        System.out.println(Set.of(1,2,3,4,5,6,7,8,9));

//        System.out.println(Map.of(1,2,3,4,5,6,7,8,9));

    }
}
