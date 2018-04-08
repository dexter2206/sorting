package bubblesort;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        return t1.compareTo(integer);
    }
}
