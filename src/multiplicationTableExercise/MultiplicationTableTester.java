package multiplicationTableExercise;

import java.util.HashSet;
import java.util.Set;

public class MultiplicationTableTester {
    public static void main(String[] args) {
        Set<MultiplicationTable> multiplicationTableSet = new HashSet<>();
        while (multiplicationTableSet.size() <= 15) {
            multiplicationTableSet.add(new MultiplicationTable((int)(Math.random()*9 + 1), (int)(Math.random()*9 + 1)));
        }
        System.out.println(multiplicationTableSet);
    }
}
