import java.util.Arrays;

import sorts.*;

public class Main {
    public static void main(String[] args) {
        int[] target = {3243, 23424, 76745, 96758, 34, 234, 2, 64, 4, 3, 4, 77, 345, 3543, 234, 2342, 26, 2354, 23, 2342, 745, 4, 345, 2, 1, 435, -354, -34};
        System.out.println("Original mas:");
        System.out.println(Arrays.toString(target));
        ISort mergeSort = new MergeSort();
        System.out.println("\nMergeSort:");
        System.out.println(Arrays.toString(mergeSort.sort(target)));
    }
}