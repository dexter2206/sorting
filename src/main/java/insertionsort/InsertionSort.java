package insertionsort;

public class InsertionSort {

    public static void sortInt(int[] array) {
        int j, value;
        for(int i = 1; i < array.length; i++) {
            value = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > value) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }

    public static void sortStringByLength(String[] array) {
        int j;
        String value;
        for(int i = 1; i < array.length; i++) {
            value = array[i];
            j = i - 1;
            while(j >= 0 && array[j].length() > value.length()) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }
}
