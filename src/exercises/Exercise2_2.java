package exercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise2_2 {
    public static void main(String[] args) {
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(1, "a");
        orderedMap.put(2, "b");
        orderedMap.put(3, "c");
        orderedMap.put(4, "d");
        orderedMap.put(5, "e");
        orderedMap.put(6, "f");
        orderedMap.put(7, "g");
        orderedMap.put(8, "h");
        orderedMap.put(9, "i");
        orderedMap.put(10, "j");
        System.out.println(orderedMap);
    }
}
