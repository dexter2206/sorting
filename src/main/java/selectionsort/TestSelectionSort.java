package selectionsort;

public class TestSelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{0, -3, 1, 10, 5, 2};
        System.out.println("Przed:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        SelectionSort.sortInt(array);
        System.out.println("Po:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
