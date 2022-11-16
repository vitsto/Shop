package multiplicationTableExercise;

import java.util.Objects;

public class MultiplicationTable {
    private final int value1;
    private final int value2;

    public MultiplicationTable(int value1, int value2) {
        // можно было и упорядочить, т.е. в value1 хранить меньший множитель, а в value2 больший
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return (value1 == that.value1 && value2 == that.value2) || (value1 == that.value2 && value2 == that.value1);
    }

    @Override
    public int hashCode() {
        int max = Math.max(value1, value2);
        int min = Math.min(value1, value2);
        return Objects.hash(min, max);
    }

    @Override
    public String toString() {
        return value1 + " * " + value2 + " = ?";
    }
}
