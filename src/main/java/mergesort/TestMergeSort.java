package mergesort;

public class TestMergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 2, 3, 2, 1};

        System.out.println("Przed:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] result = MergeSort.sortInt(array);
        System.out.println("Po:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        int[] array2 = new int[]{5, 1, 3, 7, -2, 2, 0};
        MergeSort.sortInt2(array2);
        System.out.println("Po sortInt2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
