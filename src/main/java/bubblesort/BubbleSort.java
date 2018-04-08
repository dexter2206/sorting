package bubblesort;

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

    
}
