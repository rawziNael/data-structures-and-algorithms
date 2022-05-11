package sort;

public class MergeSort{

    public  int[] mergeSort(int[] arr) {

        int n = arr.length;
        if (n > 1) {

            int mid = n / 2;
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i < n; i++) {
                right[i - mid] = arr[i];
            }
            mergeSort(left);
            mergeSort(right);

            return merge(left , right , arr);
        }else{
            return arr;
        }
    }

    public int[] merge(int[] right, int[] left, int[] arr) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return arr;
    }
}
