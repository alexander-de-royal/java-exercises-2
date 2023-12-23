package src.javacollection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        //subject_name - marks

        Map<String, Integer> map = new HashMap<>();

        map.put("german", 90);
        map.put("english", 80);
        map.put("math", 86);
        map.put("computer", 86);

        for(String key: map.keySet()){
            System.out.println(key + " = " + map.get(key));
        }

    }
}
