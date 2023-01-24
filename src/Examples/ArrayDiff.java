package Examples;

import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    /**
     * Your goal in this kata is to implement a difference function,
     * which subtracts one list from another and returns the result.
     * <p>
     * It should remove all values from list a, which are present in list b keeping their order.
     * If a value is present in b, all of its occurrences must be removed from the other.
     *
     * @param a array
     * @param b array
     * @return difference array a and b
     */
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> bList = Arrays.stream(b).boxed().toList();
        a = Arrays.stream(a).filter(item -> !bList.contains(item)).toArray();
        return a;
    }
}
