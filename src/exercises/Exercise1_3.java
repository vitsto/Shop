package exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise1_3 {
    static Map<String, Integer> collection = new HashMap<>();
    public static void main(String[] args) {
        collection.put("a", 1);
        collection.put("b", 2);
        collection.put("c", 3);
        collection.put("d", 4);
        collection.put("e", 5);

        System.out.println(collection);
        method("e", 10);
        method("f", 11);
        method("g", 12);
        System.out.println(collection);

        method("b", 2);


    }

    public static void method(String str, int value) {
        if (collection.get(str) != null && collection.get(str) == value) {
            throw new RuntimeException("Такая пара уже существует");
        }
        collection.put(str, value);
    }
}
