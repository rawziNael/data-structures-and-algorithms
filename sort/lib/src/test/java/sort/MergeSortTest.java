package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort mergeSort = new MergeSort();

    @Test
    public void testMergeSort() {


        int[] test1 = {12,8,16,4,33,1};
        int[] testSorted1 = {1,4,8,12,16,33};
        assertArrayEquals(testSorted1, mergeSort.mergeSort(test1));

        int[] test2 = {};
        int[] testSorted2 = {};
        assertArrayEquals(testSorted2, mergeSort.mergeSort(test2));

        int[] test3 = {-3,0,5,-10,-15};
        int[] testSorted3 = {-15,-10,-3,0,5};
        assertArrayEquals(testSorted3, mergeSort.mergeSort(test3));

        int[] test4 = {4};
        int[] testSorted4 = {4};
        assertArrayEquals(testSorted4, mergeSort.mergeSort(test4));

    }

    @Test
    public void testMerge() {
        int[] test1 = {5,0,-3};
        int[] test2 = {1,1,3};
        int[] mergeArray1 = {5,0,-3, 1, 1, 3};
        assertArrayEquals(mergeArray1, mergeSort.merge(test1, test2,mergeArray1));

        int[] test3 = {};
        int[] test4 = {};
        int[] mergeArray2 = {};
        assertArrayEquals(mergeArray2, mergeSort.merge(test3, test4,mergeArray2));

        int[] test5 = {3,1,12,-18,-9,10};
        int[] test6 = {0};
        int[] mergeArray3 = {3,1,12,-18,-9,10,0};
        assertArrayEquals(mergeArray3, mergeSort.merge(test5, test6,mergeArray3));
    }


}