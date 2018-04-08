package bubblesort;

import java.util.Comparator;

public class TestBubbleSortGeneric {

    public static void main(String[] args) {
        Integer[] arr = {2, -3, 0, 1, 15, 100, 2};
        BubbleSort.sort(arr);
        for(Integer i: arr) {
            System.out.println(i);
        }
        Comparator<Integer> cmp = new ReverseComparator();
        BubbleSort.sort(arr, cmp);
        for(Integer i: arr) {
            System.out.println(i);
        }
    }
}
