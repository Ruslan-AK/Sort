package sorts;

import java.util.Arrays;

public class MergeSort implements ISort{
    @Override
    public int[] sort(int[] target) {
        int[] targetCopy = Arrays.copyOf(target, target.length);
        int[] memory = new int[targetCopy.length];
        doMergeSort(targetCopy,memory,0, targetCopy.length - 1);
        return targetCopy;
    }

    private void doMergeSort(int[] target, int[] memory, int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(target, memory, lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(target, memory, middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(target, memory, lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int[] target, int[] memory, int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            memory[i] = target[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (memory[i] <= memory[j]) {
                target[k] = memory[i];
                i++;
            } else {
                target[k] = memory[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            target[k] = memory[i];
            k++;
            i++;
        }

    }
}