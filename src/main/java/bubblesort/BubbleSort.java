package bubblesort;

import java.lang.reflect.Array;
import java.util.Comparator;

public class BubbleSort {

    public static void sortInt(int[] array) {
        int tmp, count;
        for(int i = 1; i < array.length; i ++) {
//        for(int i = array.length - 2; i >= 0; i --) {
//            for(int j=0; j <= i; j++) {
            count = 0;
            for(int j = 0; j < array.length -i; j++) {
                if(array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        T tmp;
        for(int i = 1; i < array.length; i ++) {

            for(int j = 0; j < array.length -i; j++) {
                if(array[j].compareTo(array[j+1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static <T> void sort(T[] array, Comparator<T> cmp) {
        T tmp;
        for(int i = 1; i < array.length; i ++) {

            for(int j = 0; j < array.length -i; j++) {
                if(cmp.compare(array[j], array[j+1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
