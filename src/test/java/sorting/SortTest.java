package sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {

    Sort sort = new Sort();
    int[] array = {21, 9, 7, 2, 1};

    @Test
    public void insertionSortTest() {
        sort.insertionSort(array);
        sort.printArray(array);
        assertEquals(true, sort.isSorted(array));
    }

    @Test
    public void mergeSortTest() {
        sort.mergeSort(array, 0, 4);
        sort.printArray(array);
        assertEquals(true, sort.isSorted(array));
    }

    @Test
    public void mergeTest() {
        int[] a = {2, 3, 5, 7, 8, 9, 2, 5, 6, 7, 9, 20};
        int mid = (a.length - 1)/2;
        sort.merge(a, 0, mid, 11);
        sort.printArray(a);
        assertEquals(true, sort.isSorted(a));
    }

    @Test
    public void testIsSorted() {
        int[] sorted = {1, 2, 3, 4, 5};
        int[] reverse = {5, 4, 3, 2, 1};
        int[] random = {3, 6, 6, 7, 4};

        assertEquals(true, sort.isSorted(sorted));
        assertEquals(false, sort.isSorted(reverse));
        assertEquals(false, sort.isSorted(random));
    }



}
