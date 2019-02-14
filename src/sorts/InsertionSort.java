package sorts;

import java.util.Arrays;

public class InsertionSort implements ISort {
    @Override
    public int[] sort(int[] target) {
        int[] targetCopy = Arrays.copyOf(target, target.length);
        for (int i = 1; i < targetCopy.length; i++) {
            for (int j = i; j > 0; j--) {
                if (targetCopy[j] < targetCopy[j - 1]) {
                    int temp = targetCopy[j];
                    targetCopy[j] = targetCopy[j - 1];
                    targetCopy[j - 1] = temp;
                }
            }
        }
        return targetCopy;
    }
}
