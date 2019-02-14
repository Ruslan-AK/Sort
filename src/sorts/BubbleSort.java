package sorts;

import java.util.Arrays;

public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] target) {
        int[] targetCopy = Arrays.copyOf(target, target.length);
        for (int i = 0; i < targetCopy.length - 1; i++) {
            for (int j = 0; j < targetCopy.length - 1 - i; j++) {
                if (targetCopy[j] > targetCopy[j + 1]) {
                    int temp = targetCopy[j + 1];
                    targetCopy[j + 1] = targetCopy[j];
                    targetCopy[j] = temp;
                }
            }
        }
        return targetCopy;
    }
}