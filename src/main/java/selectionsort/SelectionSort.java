package selectionsort;

public class SelectionSort {

    public static void sortInt(int[] array) {
        int ind, tmp;
        for(int i = 0; i < array.length; i++) {
            ind = findMinIndex(array, i);
            if(ind != i) {
                tmp = array[i];
                array[i] = array[ind];
                array[ind] = tmp;
            }
        }
    }

    public static int findMinIndex(int[] array, int start) {
        int min = array[start];
        int ind = start;

        for(int i = start + 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                ind = i;
            }
        }
        return ind;
    }
}
