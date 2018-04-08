package insertionsort;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 2, 3, 2, 1};
        System.out.println("Przed:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        InsertionSort.sortInt(array);
        System.out.println("Po:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String[] array2 = new String[] { "oko", "ola", "as", "i", "pies"};
        System.out.println("Przed:");
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        InsertionSort.sortStringByLength(array2);
        System.out.println("Po:");
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
