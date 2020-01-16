package sorting;


public class Sort {

    public void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j > -1 && key < arr[j]) {
                arr[j+1] = arr[j];
                arr[j] = key;
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int[] array1 = new int[end - start + 1];
        int[] array2 = new int[end - start + 1];

        for(int i = 0; i < end - start + 1; i++) {
            if(i < size1) {
                array1[i] = arr[start + i];
            } else {
                array1[i] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i < end - start + 1; i++) {
            if(i < size2) {
                array2[i] = arr[mid + i + 1];
            } else {
                array2[i] = Integer.MAX_VALUE;
            }
        }

        int index1 = 0;
        int index2 = 0;

        for(int i = start; i < end + 1; i++) {
            if(array1[index1] <= array2[index2]) {
                arr[i] = array1[index1];
                index1 = index1 + 1;

            } else {
                arr[i] = array2[index2];
                index2 = index2 + 1;
            }
        }
    }

    public boolean isSorted(int[] arr) {
        boolean sorted = true;
        int small = arr[0];
        int i = 1;
        while(i < arr.length && sorted) {
            if(!(small <= arr[i])) {
                sorted = false;
            }
            small = arr[i];
            i = i + 1;
        }
        return sorted;
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println();
    }
}
