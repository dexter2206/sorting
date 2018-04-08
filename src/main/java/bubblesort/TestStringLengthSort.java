package bubblesort;

import java.util.Comparator;

public class TestStringLengthSort {
    public static void main(String[] args) {
        String[] arr = {"ala", "oko", "as", "plama", "dywan", "prysznic"};
        Comparator<String> cmp = new StringLenghtComparator();
        BubbleSort.sort(arr, cmp);
        for(String s: arr){
            System.out.println(s);
        }
    }
}
