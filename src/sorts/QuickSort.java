package sorts;

import java.util.Arrays;

public class QuickSort implements ISort {

    @Override
    public int[] sort(int[] target) {
        int[] targetCopy = Arrays.copyOf(target, target.length);
        quickSort(targetCopy, 0, targetCopy.length - 1);
        return targetCopy;
    }

    private void quickSort(int[] target, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        int pivot = target[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i <= j) {
            while (target[i] < pivot) {
                i++;
            }
            while (target[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = target[i];
                target[i] = target[j];
                target[j] = temp;
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(target, lowerIndex, j);
        if (i < higherIndex)
            quickSort(target, i, higherIndex);
    }
}
