public class maxIndexDifference {
    int maxIndexDiff(int arr[]) {
        // code here
        int n = arr.length;

        // Step 1: Create LMin[] to store min from left
        int[] LMin = new int[n];
        LMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
        }
        // Step 2: Create RMax[] to store max from right
        int[] RMax = new int[n];
        RMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            RMax[j] = Math.max(arr[j], RMax[j + 1]);
        }
        // Step 3: Traverse LMin and RMax to find maximum j - i
        int i = 0, j = 0, maxDiff = -1;
        while (i < n && j < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}
