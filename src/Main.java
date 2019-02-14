import java.util.Arrays;
import java.util.Scanner;

import search.BinarySearch;
import sorts.*;

public class Main {
    public static void main(String[] args) {
        int[] target = {3243, 23424, 76745, 96758, 34, 234, 2, 64, 4, 3, 4, 77, 345, 3543, 234, 2342, 26, 2354, 23, 2342, 745, 4, 345, 2, 1, 435, -354, -34};
        System.out.println("Original mas:");
        System.out.println(Arrays.toString(target));
        ISort insertionSort = new InsertionSort();
        System.out.println("\nInsertionSort:");
        System.out.println(Arrays.toString(insertionSort.sort(target)));
        ISort bubbleSort = new BubbleSort();
        System.out.println("\nBubbleSort:");
        System.out.println(Arrays.toString(bubbleSort.sort(target)));
        ISort selectionSort = new SelectionSort();
        System.out.println("\nSelectionSort:");
        System.out.println(Arrays.toString(selectionSort.sort(target)));
        ISort quickSort = new QuickSort();
        System.out.println("\nQuickSort:");
        System.out.println(Arrays.toString(quickSort.sort(target)));
        ISort mergeSort = new MergeSort();
        System.out.println("\nMergeSort:");
        System.out.println(Arrays.toString(mergeSort.sort(target)));
        //USE BINARYSEARCH
        BinarySearch bs = new BinarySearch();
        System.out.println("Please enter what you sought for: ");
        Scanner sc = new Scanner(System.in);
        int what = sc.nextInt();
        int result = bs.find(bubbleSort.sort(target),what);
        System.out.println("Index is:"+result);
    }
}