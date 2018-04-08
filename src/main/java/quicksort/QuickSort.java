package quicksort;

public class QuickSort {

    public static void sortInt(int[] array, int start, int stop) {
        if(start >= stop) {
            return;
        }
        int p = split(array, start, stop);
        sortInt(array, start, p-1);
        sortInt(array, p+1, stop);
    }

    public static int split(int[] array, int start, int stop) {
        int l = 0, h = array.length -2, pivot = array[array.length-1];

        while(l < h) {
            while(array[l] < pivot) {
                l++;
            }

            while(h >= l && array[h] >= pivot) {
                h--;
            }

            if(l < h) {
                swap(array, l, h);
                //l++;
                //h--;
            }
        }
        swap(array, h+1, array.length-1);
        return h+1;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
