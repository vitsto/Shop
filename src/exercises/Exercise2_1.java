package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Exercise2_1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> myMap = new HashMap<>();

        String str = "string";
        int i = 1;
        while (myMap.size() <= 5) {
            myMap.put(str + i, new ArrayList<>(List.of(
                    (int) (Math.random() * 1000),
                    (int) (Math.random() * 1000),
                    (int) (Math.random() * 1000))));
            i++;
        }

        System.out.println(myMap);

        Map<String, Integer> newMyMap = new HashMap<>();
//        for (Map.Entry<String, List<Integer>> entry : myMap.entrySet()) {
//            int sum = 0;
//            for (int j : entry.getValue()) {
//                sum += j;
//            }
//            newMyMap.put(entry.getKey(), sum);
//        }
//        System.out.println(newMyMap);

        // ИЛИ
        myMap.forEach((s, integers) -> {
            newMyMap.put(s, integers.stream().flatMapToInt(IntStream::of).sum());
        });
        System.out.println(newMyMap);
    }
}
