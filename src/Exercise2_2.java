import java.util.HashSet;
import java.util.Set;

public class Exercise2_2 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();

        while (integerSet.size() != 20) {
            integerSet.add((int)(Math.random()*1000));
        }

        System.out.println(integerSet);

//        Iterator<Integer> iterator = integerSet.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() % 2 != 0) {
//                iterator.remove();
//            }
//        }
        // ИЛИ
        integerSet.removeIf(integer -> integer % 2 != 0);

        System.out.println(integerSet);
    }
}
