package sorts;

import java.util.Arrays;

public class SelectionSort implements ISort {
    public int[] sort(int[] target) {
        int[] targetCopy = Arrays.copyOf(target, target.length);
        for (int i = 0; i < targetCopy.length - 1; i++) {
            int indx_min = i;
            for (int j = i; j < targetCopy.length; j++) {
                if (targetCopy[j] < targetCopy[indx_min]) {
                    indx_min = j;
                }
            }
            if (indx_min != i) {
                int temp = targetCopy[indx_min];
                targetCopy[indx_min] = targetCopy[i];
                targetCopy[i] = temp;
            }
        }
        return targetCopy;
    }
}