package homework;

public class Algorithms {

    public static int[] bubbleSort(int[] array) {
        int[] result = array.clone();
        int buf;
        boolean isSort = false;

        while (!isSort) {
            isSort = true;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    isSort = false;
                    buf = result[i];
                    result[i] = result[i+1];
                    result[i+1] = buf;
                }
            }
        }
        return result;
    }

    public static int binarySearch(int[] array, int item) {
        int begin = 0;
        int end = array.length - 1;
        int mid;

        while (begin <= end) {
            mid = (begin + end) / 2;
            if (array[mid] < item) {
                begin = mid + 1;
            } else if (array[mid] > item) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
