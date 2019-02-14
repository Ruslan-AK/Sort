package search;

public class BinarySearch {
    //can manipulate with descent order

    public int find(int[] inputMas, int soughtFor) {
        if (inputMas.length == 0 || inputMas == null)
            return -1;
        boolean descending = inputMas[0] > inputMas[inputMas.length - 1];//reverse order
        int index = findIndex(inputMas, soughtFor, 0, inputMas.length, descending);
        return findFirstEntry(inputMas, index);
    }

    //find first entry
    private int findFirstEntry(int[] inputMas, int index) {
        while (inputMas[index] == inputMas[index - 1]) {
            index--;
        }
        return index;
    }

    private int findIndex(int[] inputMas, int soughtFor, int left, int right, boolean order) {
        if (right >= left) {
            int middle = left + (right - left) / 2;
            if (inputMas[middle] == soughtFor)
                return middle;
            if (inputMas[middle] < soughtFor ^ order)
                return findIndex(inputMas, soughtFor, middle + 1, right, order);
            return findIndex(inputMas, soughtFor, left, middle - 1, order);
        }
        return -1;
    }
}