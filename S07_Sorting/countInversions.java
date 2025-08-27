public class countInversions {
    static int inversionCount(int arr[]) {
        // code here
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    // Recursive merge sort
    private static int mergeSortAndCount(int arr[], int l, int r) {
        int res = 0;
        if (l < r) {
            int m = l + (r - l) / 2;

            // Count in left half
            res += mergeSortAndCount(arr, l, m);

            // Count in right half
            res += mergeSortAndCount(arr, m + 1, r);

            // Count while merging
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }

    // Merge step with inversion counting
    private static int countAndMerge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int j = 0; j < n2; j++) right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        int res = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i); // all remaining in left[] are > right[j]
            }
        }

        // Copy remaining
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];

        return res;
    }
}
