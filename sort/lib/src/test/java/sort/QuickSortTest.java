package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    public void testQuickSort() {

        int[] test1 = {8,4,23,42,16,15};
        int[] expected1 = {4,8,15,16,23,42};
        assertArrayEquals(expected1, QuickSort.quickSort(test1));

        int[] test2 = {};
        int[] expected2 = {};
        assertArrayEquals(expected2, QuickSort.quickSort(test2));

        int[] test3 = {11};
        int[] expected3 = {11};
        assertArrayEquals(expected3, QuickSort.quickSort(test3));

        int[] test4 = {-15,3,6,2,-1,0};
        int[] expected4 = {-15,-1,0,2,3,6};
        assertArrayEquals(expected4, QuickSort.quickSort(test4));
    }

    @Test
    public void testPartition() {
        int[] test1 = {3, 9, 1, 5};
        assertEquals(2, QuickSort.partition(test1, 0, test1.length - 1));

        int[] test2 = {5,3,2,1,-1};
        assertEquals(0, QuickSort.partition(test2, 0, test2.length - 1));

        int[] test3 = {0,-2,5,1,7,33};
        assertEquals(5, QuickSort.partition(test3, 0, test3.length - 1));
    }

    @Test
    public void testSwap() {
        int[] test1 = {1, 2, 3, 4};
        int[] expected1 = {4, 2, 3, 1};
        QuickSort.swap(test1, 3, 0);
        assertArrayEquals(expected1, test1);

        int[] test2 = {-9, 03, 100, 9, 3, 2};
        int[] expected2 = {-9, 03, 9, 100, 3, 2};
        QuickSort.swap(test2, 2, 3);
        assertArrayEquals(expected2, test2);

        int[] test3 = {5};
        int[] expected3 = {5};
        QuickSort.swap(test3, 0, 0);
        assertArrayEquals(expected3, test3);
    }

}