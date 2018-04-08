package mergesort;

public class MergeSort {

    public static int[] sortInt(int[] array) {
        if(array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for(int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for(int i = 0; i < right.length; i++) {
            right[i] = array[mid+i];
        }

        return merge(sortInt(left), sortInt(right));
    }

    public static int[] merge(int[] array, int[] array2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[array.length + array2.length];

        while(i < array.length && j < array2.length) {
            if(array[i] <= array2[j]) {
                merged[k] = array[i];
                i++;
            }
            else {
                merged[k] = array2[j];
                j++;
            }
            k++;
        }

        while(i < array.length) {
            merged[k] = array[i];
            i++;
            k++;
        }
        while(j < array2.length) {
            merged[k] = array2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void sortInt2(int[] array) {
        sortInt2(array, 0, array.length-1);
    }

    public static void sortInt2(int[] array, int start, int stop) {
        if( stop <= start) {
            return;
        }

        int mid = (start + stop) / 2;

        sortInt2(array, start, mid);
        sortInt2(array, mid + 1, stop);
        merge2(array, start, mid, stop);
    }

    public static void merge2(int[] array, int start, int mid, int stop) {
        int[] copy = new int[stop - start + 1];

        for(int i = start; i <= stop; i ++) {
            copy[i-start] = array[i];
        }
        int newMid = mid - start;
        int i = 0, j = newMid+1, k = start;

        while(i <= newMid && j < copy.length) {
            if(copy[i] <= copy[j]) {
                array[k] = copy[i];
                i++;
            }
            else {
                array[k] = copy[j];
                j++;
            }
            k++;
        }

        while(i <= newMid) {
            array[k] = copy[i];
            k++;
            i++;
        }

        while(j < copy.length) {
            array[k] = copy[j];
            k++;
            j++;
        }
    }
}
