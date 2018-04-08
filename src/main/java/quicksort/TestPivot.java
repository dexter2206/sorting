package quicksort;

public class TestPivot {

    public static void main(String[] args) {
        int[] array = {2, 3, -1, 0, 4, 1};
        QuickSort.split(array);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
